package syntax.symbol;

import symbolPackage.Table;
import syntax.Syntax;
import java.util.Set;
import javax.swing.*;

public abstract class Structure extends syntax.Structure
{
    Table   table;

    public Structure(String name, int direction, Table table)
    {
        super(name, direction);
        init(table);
    }

    void init(Table table)
    {
        this.table = table;
    }

    @Override public String getType()
    {
        return "symbol";
    }

    @Override
    public void saveData(Set<Syntax> visited)
    {

    }

    public Box display()
    {
        Box result = new Box(this.direction);

        return result;
    }
}
