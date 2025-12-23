package syntax.choose;

import main.bootstrap;
import syntax.Edit;
import utility.Named;
import utility.Prompt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Structure extends syntax.Structure
{
    public ArrayList<syntax.Structure> list = new ArrayList<syntax.Structure>();

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

    @Override public syntax.Edit make()
    {
        return new syntax.choose.Edit(this);
    }
}
