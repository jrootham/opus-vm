package syntax.list.variable;

import syntax.Edit;

public class Structure extends syntax.list.Structure
{
    public syntax.Structure template;

//    public Structure(syntax.Structure template)
//    {
//        super();
//        this.template = template;
//    }
//
    public Structure(String name, int direction)
    {
        super(name, direction);
        this.template = null;
    }

    public void setTemplate(syntax.Structure template)
    {
        this.template = template;
    }

    @Override
    public Edit make()
    {
        return new syntax.list.variable.Edit(this);
    }
}
