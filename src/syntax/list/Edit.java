package syntax.list;

import syntax.Structure;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Edit extends syntax.Edit
{
    public ArrayList<syntax.Edit> list;

    public Edit(Structure parent)
    {
        super(parent);
        this.list = new ArrayList<syntax.Edit>();
    }

    @Override
    public Box display()
    {
        Box result = new Box(super.getParent().direction);

System.out.println(this.list.size());
        Iterator<syntax.Edit> iterator = this.list.iterator();
        System.out.println(iterator.hasNext());
        while (iterator.hasNext())
        {
            System.out.println("Looping");
            result.add(iterator.next().display());
        }

        return result;
    }
}
