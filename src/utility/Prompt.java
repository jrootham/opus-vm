package utility;

import javax.swing.*;

import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.OK_OPTION;

public abstract class Prompt
{
    String title;

    public Prompt(String title)
    {
        this.title = title;
    }

    public Object input()
    {
        return new JLabel("Input");
    }

    boolean validate()
    {
        return true;
    }

    public abstract void set();

    public void prompt() {
        int result = JOptionPane.showConfirmDialog(null, input(), this.title, OK_CANCEL_OPTION);

        if (result == OK_OPTION) {
            if (validate()) {
                set();
            } else {
                prompt();
            }
        }
    }
}


