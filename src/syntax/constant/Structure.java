package syntax.constant;

import syntax.Edit;

import javax.swing.*;

public class Structure extends syntax.Structure
{
    String value;

    public Structure(String name, int direction, String value)
    {
        super(name, direction);
        this.value = value;
    }

    public Structure(String name, int direction)
    {
        super(name, direction);
        this.value = null;
    }

    public Edit make()
    {
        return new syntax.constant.Edit(this);
    }
}
