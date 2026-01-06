package syntax.choose;


import javax.swing.*;
import java.util.ArrayList;

public class Structure extends syntax.Structure
{
    public ArrayList<syntax.Structure> list = new ArrayList<syntax.Structure>();

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
