package syntax;

import utility.Named;

import javax.swing.*;
import java.awt.*;

public abstract class Structure extends Named
{
    public static ACROSS = new BoxLayout(BoxLayout.X_AXIS);
    public static DOWN = new BoxLayout(BoxLayout.Y_AXIS);

    public LayoutManager    layout;

    public Structure(LayoutManager layout
    {
        super();
        this.layout = layout;
    }

    public Structure(String name, LayoutManager layout)
    {
        super(name);
        this.layout = layout;
    }

    public abstract JPanel display();

    public abstract Edit make();
}
