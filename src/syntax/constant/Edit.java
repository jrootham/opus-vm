package syntax.constant;

import utility.Prompt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Edit extends syntax.Edit
{
    syntax.constant.Structure parent;
    String value;

    public Edit(Structure parent)
    {
        super();
        this.parent = parent;
        this.value = null;
    }

    @Override public Box display()
    {
        Box result = new Box(this.parent.direction);

        if (this.value != null)
        {
            result.add(new JLabel(this.value));
            result.add(Box.createGlue());
        }
        else
        {
            JButton button = new JButton("Fill");
            button.addActionListener(new Listener(this));
            result.add(button);
            result.add(Box.createGlue());
        }

        return result;
    }

    class Listener implements ActionListener
    {
        Edit current;

        Listener(Edit current)
        {
            this.current = current;
        }

        @Override
        public void actionPerformed(ActionEvent event)
        {
            Prompt prompt = new Prompt(this.current);
            prompt.prompt();
            main.bootstrap.refresh();
        }
    }

    class Prompt extends utility.TextPrompt
    {
        Edit current;

        Prompt(Edit current)
        {
            super("Enter Constant");
            this.current = current;
        }

        @Override
        public void set()
        {
            current.value = getText();
        }
    }
}
