package syntax.choose;

import syntax.Named;
import syntax.Syntax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Set;

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
    public syntax.Structure getParentBase()
    {
        return this.parent;
    }

    @Override public void saveData(Set<Syntax> visited)
    {
        if (this.choice != null)
        {
            this.connect(this.choice);
            this.choice.save(visited);
        }
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
        public JComboBox<Named> dropDown;

        public StructurePrompt(String title, ArrayList<syntax.Structure> list)
        {
            super(title);
            Named[] nameList = new Named[list.size()];
            this.dropDown = new JComboBox<>(list.toArray(nameList));
        }

        @Override public Object input()
        {
            return this.dropDown;
        }

        @Override public void set()
        {
            int index = this.dropDown.getSelectedIndex();
            syntax.Structure result = parent.list.get(index);
            choice = result.make();
            main.bootstrap.refresh();
        }
    }
}
