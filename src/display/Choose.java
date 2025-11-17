package display;

import structure.Choice;

import javax.swing.*;

public class Choose extends Base
{
    structure.Choose choose;

    Choose(structure.Choose choose)
    {
        this.choose = choose;
    }

    JPanel display()
    {
        JPanel panel = new JPanel();
        JButton button = new JButton(this.choose.getName());
    }
}
