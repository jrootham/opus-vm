package syntax.choose;

import syntax.Edit;

import javax.swing.*;
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

        JButton button = new JButton("Choose");

        result.add(button);

        result.add((Box.createGlue()));

        return result;
    }

    public class Prompt extends utility.Prompt
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
