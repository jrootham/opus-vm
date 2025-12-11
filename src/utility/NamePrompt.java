package utility;

import javax.swing.*;
import java.util.ArrayList;

public class NamePrompt extends Prompt
{
    public JComboBox<Named> dropDown;

    public NamePrompt(String title, ArrayList<Named> list)
    {
        super(title);

        Named[] nameList = new Named[list.size()];
        this.dropDown = new JComboBox<>(list.toArray(nameList));
    }

    @Override public Object input()
    {
        return this.dropDown;
    }
}
