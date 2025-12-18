package syntax;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;

public abstract class Edit
{
    public Structure structure;
    public FlowLayout layout;

    public Edit(Structure structure, LayoutManager layout)
    {
        this.structure = structure;
        this.layout = layout;
    }

    public abstract JPanel display();

    public static LayoutManager across()
    {
        return new BoxLayout(BoxLayout.X_AXIS);
    }

    public static LayoutManager down()
    {
        return new BoxLayout(BoxLayout.Y_AXIS);
    }
}
