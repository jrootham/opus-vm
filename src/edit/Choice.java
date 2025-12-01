package edit;

import javax.swing.*;

public class Choice
{
    structure.Choice structure;
    Choice choice;

    public Choice(structure.Choice structure)
    {
        this.structure = structure;
        this.choice = null;
    }

    public JPanel display()
    {
        return new JPanel();
    }
}
