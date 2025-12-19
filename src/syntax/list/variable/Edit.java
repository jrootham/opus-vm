package syntax.list.variable;

import syntax.Structure;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.bootstrap;

public class Edit extends syntax.list.Edit
{
    Structure template;

    public Edit(Structure parent, Structure template)
    {
        super(parent);
        this.template = template;
    }

    @Override
    public Box display()
    {
        System.out.println("variable");
        Box result = super.display();
        JButton button = new JButton("Add");
        class Listener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                list.add(template.make());
                bootstrap.refresh();
            }
        }

        button.addActionListener(new Listener());

        result.add(button);

        return result;
    }
}
