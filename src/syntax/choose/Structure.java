package syntax.choose;


import syntax.Syntax;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Structure extends syntax.Structure
{
    public ArrayList<syntax.Structure> list = new ArrayList<>();

    public Structure(String name, int direction)
    {
        super(name, direction);
    }

    public void add(syntax.Structure next)
    {
        list.add(next);
    }

    @Override public String getType()
    {
        return "choose";
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

    @Override public syntax.Edit make()
    {
        return new syntax.choose.Edit(this);
    }
}
