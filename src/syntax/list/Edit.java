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
    public JPanel display()
    {
        JPanel result = new JPanel();

        Iterator<syntax.Edit> iterator = list.iterator();
        while (iterator.hasNext())
        {
            result.add(iterator.next().display());
        }

        return result;
    }
}
