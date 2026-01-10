package syntax.compile;

import javax.swing.*;

public class Edit extends syntax.Edit
{
    Structure parent;

    public Edit(Structure parent)
    {
        super();
        this.parent = parent;
    }

    @Override public Box display()
    {
        Box result = new Box(this.parent.direction);

        result.add(new JLabel(this.parent.value));
        result.add(Box.createGlue());

        return result;
    }
}
