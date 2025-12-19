package syntax.list.variable;

import syntax.Edit;

public class Structure extends syntax.list.Structure
{
    syntax.Structure template;

//    public Structure(syntax.Structure template)
//    {
//        super();
//        this.template = template;
//    }
//
    public Structure(String name, int direction, syntax.Structure template)
    {
        super(name, direction);
        this.template = template;
    }

    @Override
    public Edit make()
    {
        return new syntax.list.variable.Edit(this, this.template);
    }
}
