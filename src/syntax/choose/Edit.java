package syntax.choose;

import javax.swing.*;

public class Edit extends syntax.Edit
{
    syntax.Edit choice;

    public Edit(Structure structure)
    {
        super(structure);

        choice = null;
    }

    @Override
    public JPanel display()
    {
        if (this.choice != null)
        {
            return this.choice.display();
        }
        else
        {
            return structure.display();
        }
    }
}
