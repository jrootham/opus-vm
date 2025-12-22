package syntax.choose;

import main.bootstrap;
import syntax.Edit;
import utility.Named;
import utility.Prompt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public  class Structure extends syntax.Structure
{
    ArrayList<syntax.Structure> list = new ArrayList<syntax.Structure>();

//    public Structure()
//    {
//        super();
//    }
//
    public Structure(String name, int direction)
    {
        super(name, direction);
    }

    public void add(syntax.Structure next)
    {
        list.add(next);
    }

    @Override
    public Box display()
    {
        Box result = new Box(this.direction);

        Prompt prompt = new Prompt("Choose", this.list);

        JButton button = new JButton("Choose", new Listener());

        result.add(button);

        result.add((Box.createGlue()));

        return result;
    }

    class Listener implements ActionListener
    {
        class Listener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            }
        }
    }

//    public class StructurePrompt extends utility.Prompt
//    {
//        public JComboBox<Named> dropDown;
//
//        public StructurePrompt(String title, ArrayList<syntax.Structure> list)
//        {
//            super(title);
//
//            Named[] nameList = new Named[list.size()];
//            this.dropDown = new JComboBox<>(list.toArray(nameList));
//        }
//
//        @Override public Object input()
//        {
//            return this.dropDown;
//        }
//    }
    public class StructurePrompt extends utility.Prompt
    {
        public ArrayList<syntax.Structure> list;

        public Prompt(String title, ArrayList<syntax.Structure> list)
        {
            super(title);

            this.list = list;
        }
    }

    @Override
    public syntax.Edit make()
    {
        return new syntax.choose.Edit(this);
    }
}
