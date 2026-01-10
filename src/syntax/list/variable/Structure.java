package syntax.list.variable;

import syntax.Edit;

public class Structure extends syntax.list.Structure
{
    public syntax.Structure template;

    public Structure(String name, int direction, syntax.Structure template)
    {
        super(name, direction);
        this.template = template;
    }

    @Override
    public Edit make()
    {
        return new syntax.list.variable.Edit(this);
    }
}
