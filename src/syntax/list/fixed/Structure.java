package syntax.list.fixed;

import syntax.Edit;

public class Structure extends syntax.list.Structure
{
    public Structure()
    {
        super();
        init();
    }

    public Structure(String name)
    {
        super(name);
        init();
    }

    void  init()
    {

    }

    public Edit make()
    {
        return new syntax.list.fixed.Edit(this);
    }
}
