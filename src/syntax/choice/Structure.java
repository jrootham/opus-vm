package syntax.choice;

import syntax.Edit;

import javax.swing.*;

public abstract class Structure extends syntax.Structure
{
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

    }


    public JPanel display()
    {
        JPanel result = new JPanel();

        return result;
    }
}
