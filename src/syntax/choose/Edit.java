package syntax.choose;

import utility.Prompt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Edit extends syntax.Edit
{
    Structure parent;
    syntax.Edit choice;

    public Edit(Structure parent)
    {
        super();

        this.parent = parent;
        choice = null;
    }

    @Override
    public Box display()
    {
        if (this.choice != null)
        {
            return this.choice.display();
        }
        else
        {
            return unsetDisplay();
        }
    }

    Box unsetDisplay()
    {
        Box result = new Box(this.parent.direction);

        JButton button = new JButton("Choose");
        button.addActionListener(new Listener());

        result.add(button);

        result.add((Box.createGlue()));

        return result;
    }

    class Listener implements ActionListener
    {
        @Override public void actionPerformed(ActionEvent e)
        {
            StructurePrompt pick = new StructurePrompt("Choose", parent.list);

            pick.prompt();
        }
    }

    public class StructurePrompt extends utility.Prompt
    {
        public JComboBox<syntax.Structure> dropDown;

        public StructurePrompt(String title, ArrayList<syntax.Structure> list)
        {
            super(title);

            this.dropDown = new JComboBox<>(list.toArray(structureList));
        }

        @Override public Object input()
        {
            return this.dropDown;
        }

        @Override void set()
        {
            syntax.Structure result = this.dropDown.getSelectedObjects();

            System.out.println(result);

            choice = result;
        }
    }
}
