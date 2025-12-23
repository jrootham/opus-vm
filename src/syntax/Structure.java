package syntax;

import utility.Named;

import javax.swing.*;
import java.awt.*;

public abstract class Structure extends Named
{
    public static int ACROSS = BoxLayout.X_AXIS;
    public static int DOWN = BoxLayout.Y_AXIS;

    public int direction = ACROSS;

//    public Structure()
//    {
//        super();
//    }
//
//    public Structure(int direction)
//    {
//        super();
//        this.direction = direction;
//    }
//
//    public Structure(String name)
//    {
//        super(name);
//    }

    public Structure(String name, int direction)
    {
        super(name);
        this.direction = direction;
    }

    public Box display()
    {
        return new Box(BoxLayout.X_AXIS);
    }

    public abstract Edit make();
}
