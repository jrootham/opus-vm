package syntax.list;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

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
