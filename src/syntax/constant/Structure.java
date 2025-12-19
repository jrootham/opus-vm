package syntax.constant;

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
    public Structure(String name, int direction, String value)
    {
        super(name, direction);
        this.value = value;
    }

    public Edit make()
    {
        return new syntax.constant.Edit(this, this.value);
    }

    public Box display()
    {
        Box result = new Box(this.direction);

        return result;
    }
}
