package main;

import symbolPackage.Table;
import syntax.Structure;

public class Init
{
    public syntax.Edit init()
    {
        Table table = new Table();

//        syntax.placeholder.Structure constant = new syntax.placeholder.Structure("constant", Structure.ACROSS);
        syntax.name.Structure name = new syntax.name.Structure("name", Structure.ACROSS, table);
        syntax.list.variable.Structure variable = new syntax.list.variable.Structure("variableList", Structure.ACROSS);
        syntax.list.fixed.Structure fixed = new syntax.list.fixed.Structure("fixedList", Structure.ACROSS);
        syntax.choose.Structure choose = new syntax.choose.Structure("choose", Structure.ACROSS);

        syntax.choose.Structure pick = new syntax.choose.Structure("field", Structure.ACROSS);

//        pick.add(constant);
        pick.add(name);
        pick.add(variable);
        pick.add(fixed);
        pick.add(choose);

        syntax.name.Structure id = new syntax.name.Structure("id", Structure.ACROSS, table);

        syntax.list.fixed.Structure statement = new syntax.list.fixed.Structure("statement", Structure.ACROSS);
        statement.add(id);
        statement.add(pick);

        syntax.list.variable.Structure root = new syntax.list.variable.Structure("root", Structure.DOWN);
        root.setTemplate(statement);

        return root.make();
    }
}
