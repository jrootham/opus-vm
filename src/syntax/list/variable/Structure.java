package syntax.list.variable;

import syntax.Edit;

public class Structure extends syntax.list.Structure
{
    syntax.Structure template;

    public Structure(syntax.Structure template)
    {
        super();
        this.template = template;
    }

    public Structure(String name)
    {
        super(name);
        this.template = template;
    }

    public syntax.Structure getTemplate()
    {
        return template;
    }

    @Override
    public Edit make()
    {
        return new syntax.list.variable.Edit(this);
    }
}
