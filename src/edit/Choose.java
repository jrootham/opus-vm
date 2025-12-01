package edit;

import javax.swing.*;

public class Choose
{
    structure.Choose structure;
    Edit choice;

    public Choose(structure.Choose structure)
    {
        this.structure = structure;
        this.choice = null;
    }

    public JPanel display()
    {
        if (choice != null)
        {
            return choice.display();
        }
        else
        {
            return structure.display(this);
        }
    }

    public void set(Edit choice)
    {
        this.choice = choice;
    }
}
