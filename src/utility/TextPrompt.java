package utility;

import javax.swing.*;

public abstract class TextPrompt extends Prompt
{
    JTextField textField;

    public TextPrompt(String title)
    {
        super(title);

        textField = new JTextField();
    }

    @Override
    public Object input()
    {
        return textField;
    }

    public String getText()
    {
        return textField.getText();
    }
}
