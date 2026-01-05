package syntax.constant;

import utility.Prompt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Edit extends syntax.Edit
{
    syntax.constant.Structure parent;

    public Edit(Structure parent)
    {
        super();
        this.parent = parent;
    }

    @Override public Box display()
    {
        Box result = new Box(this.parent.direction);

        if (parent.value != null)
        {
            result.add(new JLabel(parent.value));
            result.add(Box.createGlue());
        }
        else
        {
            JButton button = new JButton("Fill");
            button.addActionListener(new Listener(this.parent));
            result.add(button);
            result.add(Box.createGlue());
        }

        return result;
    }

    class Listener implements ActionListener
    {
        Structure parent;

        Listener(Structure parent)
        {
            this.parent = parent;
        }

        @Override
        public void actionPerformed(ActionEvent event)
        {
            Prompt prompt = new Prompt(this.parent);
            prompt.prompt();
            main.bootstrap.refresh();
        }
    }

    class Prompt extends utility.TextPrompt
    {
        Structure parent;

        Prompt(Structure parent)
        {
            super("Enter Constant");
            this.parent = parent;
        }

        @Override
        public void set()
        {
            parent.value = getText();
        }
    }
}
