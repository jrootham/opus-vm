package syntax.list;

import javax.swing.*;

public abstract class Structure extends syntax.Structure
{
    syntax.Structure list;

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
        list = null;
    }

    @Override
    public JPanel display()
    {
        JPanel result = new JPanel();

        return result;
    }
}
