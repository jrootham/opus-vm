package syntax.constant;

import syntax.Structure;

import javax.swing.*;

public class Edit extends syntax.Edit
{
    String value;

    public Edit(Structure parent, String value)
    {
        super(parent);
        this.value = value;
    }

    @Override
    public Box display()
    {
        if (this.value != null)
        {
            Box result = new Box(this.getParent().direction);
            result.add(new JLabel(this.value));
            result.add(Box.createGlue());
            return result;
        }
        else
        {
            return this.getParent().display();
        }
    }
}
