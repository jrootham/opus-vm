package syntax.list.fixed;

import javax.swing.*;

public class Edit extends syntax.Edit
{
    syntax.list.fixed.Structure parent;

    Edit(Structure parent)
    {
        super();
        this.parent = parent;
    }

    @Override
    public Box display()
    {
        return new Box(BoxLayout.X_AXIS);
    }
}
