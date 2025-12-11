package syntax;

import utility.Named;

import javax.swing.*;

public abstract class Structure extends Named
{
    public Structure()
    {
        super();
    }

    public Structure(String name)
    {
        super(name);
    }

    public abstract JPanel display();

    public abstract Edit make();
}
