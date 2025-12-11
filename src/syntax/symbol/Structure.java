package syntax.symbol;

import symbol.Table;
import syntax.Edit;

import javax.swing.*;

public class Structure extends syntax.Structure
{
    Table   table;

    public Structure(Table table)
    {
        super();
        init(table);
    }

    public Structure(String name, Table table)
    {
        super(name);
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

    public JPanel display()
    {
        JPanel result = new JPanel();

        return result;
    }
}
