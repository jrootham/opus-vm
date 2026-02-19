package syntax.compiledConstant;

import syntax.Edit;
import syntax.Syntax;

import java.util.Set;

public class Structure extends syntax.Structure
{
    String value;

    public Structure(String name, int direction, String value)
    {
        super(name, direction);
        this.value = value;
    }

    @Override public String getType()
    {
        return "compiledConstant";
    }

    @Override public void saveData(Set<Syntax> visited)
    {
        System.out.println(value + " " + this.getType());
    }

    @Override
    public Edit make()
    {
        return new syntax.compiledConstant.Edit(this);
    }
}
