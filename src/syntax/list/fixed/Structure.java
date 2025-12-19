package syntax.list.fixed;

import syntax.Edit;

import javax.swing.*;

public class Structure extends syntax.list.Structure
{
//    public Structure()
//    {
//        super();
//    }
//
//    public Structure(int direction)
//    {
//        super(direction);
//    }
//
//    public Structure(String name)
//    {
//        super(name);
//    }
//
    public Structure(String name, int direction)
    {
        super(name, direction);
    }

    public Box display()
    {
        Box result = new Box(this.direction);

        return result;
    }

    public Edit make()
    {
        return new syntax.list.fixed.Edit(this);
    }
}
