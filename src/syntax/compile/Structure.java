package syntax.compile;

import syntax.Edit;

public class Structure extends syntax.Structure
{
    String value;

    public Structure(String name, int direction, String value)
    {
        super(name, direction);
        this.value = value;
    }

    @Override
    public Edit make()
    {
        return new syntax.compile.Edit(this);
    }
}
