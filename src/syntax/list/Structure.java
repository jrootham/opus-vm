package syntax.list;

import javax.swing.*;
import java.util.ArrayList;

public abstract class Structure extends syntax.Structure
{
    ArrayList<syntax.Structure> list;

    public Structure()
    {
        super();
        init();
    }

    public Structure(String name)
    {
        super(name);
        init();
    }

    void init()
    {
        list = new ArrayList<>();
    }

    @Override
    public JPanel display()
    {
        JPanel result = new JPanel();

        return result;
    }

    public void add(syntax.Structure structure)
    {
        list.add(structure);
    }
}
