package syntax.list.variable;

import syntax.Structure;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Edit extends syntax.list.Edit
{
    public Edit(Structure parent)
    {
        super(parent);
    }

    @Override
    public JPanel display()
    {
        System.out.println("Before");

        JPanel result = super.display();
        JButton button = new JButton("Add");
        class Listener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println(structure);
                list.add(structure.make());
                System.out.println(list.size());
            }
        }

        button.addActionListener(new Listener());

        result.add(button);

        return result;
    }
}
