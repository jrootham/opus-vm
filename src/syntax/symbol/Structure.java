package syntax.symbol;

import symbolPackage.Table;
import javax.swing.*;

public abstract class Structure extends syntax.Structure
{
    Table   table;

//    public Structure(Table table)
//    {
//        super();
//        init(table);
//    }
//
    public Structure(String name, int direction, Table table)
    {
        super(name, direction);
        init(table);
    }

    void init(Table table)
    {
        this.table = table;
    }

    /*
    public Edit make()
    {

    }
    */

    public Box display()
    {
        Box result = new Box(this.direction);

        return result;
    }
}
