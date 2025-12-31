package syntax.list.fixed;

import syntax.Edit;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Structure extends syntax.list.Structure
{
    public ArrayList<syntax.Structure> list;

    public Structure(String name, int direction)
    {
        super(name, direction);
        this.list = new ArrayList<>();
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
