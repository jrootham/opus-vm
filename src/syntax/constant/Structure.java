package syntax.constant;

import syntax.Edit;

import javax.swing.*;

public class Structure extends syntax.Structure
{
    String value = null;

    public Structure(String value)
    {
        super();
        init(value);
    }

    public Structure(String name, String value)
    {
        super(name);
        init(value);
    }

    void init(String value)
    {
        this.value = value;
    }

    public Edit make()
    {
        return new syntax.constant.Edit(this, this.value);
    }

    public JPanel display()
    {
        JPanel result = new JPanel();

        return result;
    }
}
