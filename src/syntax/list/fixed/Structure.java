package syntax.list.fixed;

import syntax.Edit;
import syntax.Syntax;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Structure extends syntax.list.Structure
{
    public ArrayList<syntax.Structure> list;

    public Structure(String name, int direction)
    {
        super(name, direction);
        this.list = new ArrayList<>();
    }

    @Override public String getType()
    {
        return "fixed";
    }

    @Override
    public void saveData(Set<Syntax> visited)
    {
        Iterator<syntax.Structure> iterator = list.iterator();

        while (iterator.hasNext())
        {
            syntax.Structure item = iterator.next();
            this.connect(item);
            item.save(visited);
        }
    }

    public void add(syntax.Structure item)
    {
        this.list.add(item);
    }

    public Edit make()
    {
        syntax.list.fixed.Edit result = new syntax.list.fixed.Edit(this);

        Iterator<syntax.Structure> iterator = this.list.iterator();

        while (iterator.hasNext())
        {
            result.add(iterator.next().make());
        }

        return result;
    }
}
