package syntax.list.variable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.bootstrap;

public class Edit extends syntax.list.Edit
{
    private syntax.list.variable.Structure parent;

    public Edit(Structure parent)
    {
        super(parent);
        this.parent = parent;
    }

    @Override
    public Box display()
    {
        Box result = super.display();
        JButton button = new JButton("Add");
        class Listener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                list.add(parent.template.make());
                bootstrap.refresh();
            }
        }

        button.addActionListener(new Listener());

        result.add(button);

        return result;
    }
}
