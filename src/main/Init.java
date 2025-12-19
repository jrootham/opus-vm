package main;

import syntax.Structure;

public class Init
{
    public syntax.Edit init()
    {
        syntax.choose.Structure pick = new syntax.choose.Structure("Field", Structure.ACROSS);
        syntax.list.variable.Structure list = new syntax.list.variable.Structure("list",Structure.ACROSS, pick);

        syntax.list.fixed.Structure constant = new syntax.list.fixed.Structure("Constant", Structure.ACROSS);
        syntax.list.fixed.Structure name = new syntax.list.fixed.Structure("Name", Structure.ACROSS);
        syntax.list.fixed.Structure variable = new syntax.list.fixed.Structure("Variable List", Structure.ACROSS);
        syntax.list.fixed.Structure fixed = new syntax.list.fixed.Structure("Fixed List", Structure.ACROSS);
        syntax.list.fixed.Structure choose = new syntax.list.fixed.Structure("Choose", Structure.ACROSS);

        pick.add(constant);
        pick.add(name);
        pick.add(variable);
        pick.add(fixed);
        pick.add(choose);

        syntax.list.variable.Structure root = new syntax.list.variable.Structure("Root", Structure.DOWN, pick);

        root.add(list);

        return root.make();
    }

    public void setHead(syntax.list.fixed.Structure field)
    {

    }
}
