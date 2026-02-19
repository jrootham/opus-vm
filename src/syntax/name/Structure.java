package syntax.name;

import symbolPackage.Table;
import syntax.Edit;
import syntax.Syntax;

import java.util.Set;

public class Structure extends syntax.Structure
{
    public Table table;

    public Structure(String name, int direction, Table table)
    {
        super(name, direction);

        this.table = table;
    }

    @Override public String getType()
    {
        return "name";
    }

    @Override
    public void saveData(Set<Syntax> visited)
    {

    }

    public  Edit make()
    {
        return new syntax.name.Edit(this);
    }
}
