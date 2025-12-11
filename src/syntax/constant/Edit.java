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
    public JPanel display()
    {
        JPanel result = new JPanel();

        if (this.value != null)
        {
            result.add(new JLabel(this.value));
        }
        else
        {
            result.add(new JLabel("Value must not be null"));
        }

        return result;
    }
}
