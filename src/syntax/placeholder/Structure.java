package syntax.placeholder;

import syntax.Edit;

import javax.swing.*;

public class Structure extends syntax.Structure
{
    String value = null;

//    public Structure(String value)
//    {
//        super();
//        init(value);
//    }
//
    public Structure(String name, int direction)
    {
        super(name, direction);
        this.value = null;
    }

    public Edit make()
    {
        return new syntax.placeholder.Edit(this, this.value);
    }

    public Box display()
    {
        Box result = new Box(this.direction);

        return result;
    }
}
