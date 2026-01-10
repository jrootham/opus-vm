package syntax.constant;

import syntax.Edit;

import javax.swing.*;

public class Structure extends syntax.Structure
{
    public Structure(String name, int direction)
    {
        super(name, direction);
    }

    public Edit make()
    {
        return new syntax.constant.Edit(this);
    }
}
