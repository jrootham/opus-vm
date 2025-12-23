package syntax.constant;

import javax.swing.*;

public class Edit extends syntax.Edit
{
    syntax.constant.Structure parent;
    String value;

    public Edit(Structure parent, String value)
    {
        super();
        this.parent = parent;
        this.value = value;
    }

    @Override public Box display()
    {
        if (this.value != null)
        {
            Box result = new Box(this.parent.direction);
            result.add(new JLabel(this.value));
            result.add(Box.createGlue());
            return result;
        }
        else
        {
            return this.parent.display();
        }
    }
}
