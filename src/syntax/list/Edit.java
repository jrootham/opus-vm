package syntax.list;

import syntax.Syntax;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Edit extends syntax.Edit
{
    public ArrayList<syntax.Edit> list;
    private Structure parent;

    public Edit(Structure parent)
    {
        super();
        this.parent = parent;
        this.list = new ArrayList<syntax.Edit>();
    }

    @Override
    public syntax.Structure getParentBase()
    {
        return this.parent;
    }

    @Override public void saveData(Set<Syntax> visited)
    {
        Iterator<syntax.Edit> iterator = list.iterator();

        while (iterator.hasNext())
        {
            syntax.Edit item = iterator.next();
            this.connect(item);
            item.save(visited);
        }
    }

    public void add(syntax.Edit item)
    {
        this.list.add(item);
    }

    @Override
    public Box display()
    {
        Box result = new Box(this.parent.direction);

        Iterator<syntax.Edit> iterator = this.list.iterator();
        while (iterator.hasNext())
        {
            result.add(iterator.next().display());
        }

        result.add(Box.createGlue());
        return result;
    }
}
