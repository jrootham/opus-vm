package syntax.list;

import javax.swing.*;
import java.util.ArrayList;

public abstract class Structure extends syntax.Structure
{
    ArrayList<syntax.Structure> list;

//    public Structure()
//    {
//        super();
//        init();
//    }
//
//    public Structure(int direction)
//    {
//        super(direction);
//        init();
//    }
//
    public Structure(String name, int direction)
    {
        super(name, direction);
        init();
    }

    void init()
    {
        list = new ArrayList<>();
    }

    @Override
    public Box display()
    {
        Box result = new Box(this.direction);

        return result;
    }

    public void add(syntax.Structure structure)
    {
        list.add(structure);
    }
}
