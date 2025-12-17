import syntax.choose.Structure;

public class Init
{
    public syntax.Edit init()
    {
        syntax.list.variable.Structure list = new syntax.list.variable.Structure("list");
        Structure pick = new Structure("Field");
        list.add(pick);

        syntax.list.fixed.Structure constant = new syntax.list.fixed.Structure("Constant");
        syntax.list.fixed.Structure name = new syntax.list.fixed.Structure("Name");
        syntax.list.fixed.Structure variable = new syntax.list.fixed.Structure("Variable List");
        syntax.list.fixed.Structure fixed = new syntax.list.fixed.Structure("Fixed List");
        syntax.list.fixed.Structure choose = new syntax.list.fixed.Structure("Choose");

        pick.add(constant);
        pick.add(name);
        pick.add(variable);
        pick.add(fixed);
        pick.add(choose);

        syntax.list.variable.Structure root = new syntax.list.variable.Structure("Root");

        root.add(list);

        return root.make();
    }

    public void setHead(syntax.list.fixed.Structure field)
    {

    }
}
