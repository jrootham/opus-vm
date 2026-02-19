package syntax.constant;

import syntax.Edit;
import syntax.Syntax;

import java.util.Set;

public class Structure extends syntax.Structure
{
    public Structure(String name, int direction)
    {
        super(name, direction);
    }

    @Override public String getType()
    {
        return "constant";
    }

    @Override public void saveData(Set<Syntax> visited)
    {

    }

    public Edit make()
    {
        return new syntax.constant.Edit(this);
    }
}
