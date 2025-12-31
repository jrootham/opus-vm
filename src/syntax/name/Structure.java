package syntax.name;

import symbolPackage.Table;
import syntax.Edit;

public class Structure extends syntax.Structure
{
    public Table table;

    public Structure(String name, int direction, Table table)
    {
        super(name, direction);

        this.table = table;
    }

    public  Edit make()
    {
        return new syntax.name.Edit(this);
    }
}
