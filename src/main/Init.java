package main;

import symbolPackage.Table;
import syntax.Structure;

public class Init
{
    public syntax.Edit init()
    {
        Table table = new Table();

        syntax.choose.Structure pick = new syntax.choose.Structure("field", Structure.ACROSS);

        syntax.list.fixed.Structure constant = statement("Constant", table);
        constant.add(new syntax.constant.Structure("enter", Structure.ACROSS));

        syntax.list.fixed.Structure name = statement("Name", table);

        syntax.list.fixed.Structure variable = statement("Variable", table);

        syntax.list.fixed.Structure fixed = statement("Fixed", table);

        syntax.list.fixed.Structure choose = statement("Choose", table);

        pick.add(constant);
        pick.add(name);
        pick.add(variable);
        pick.add(fixed);
        pick.add(choose);

        syntax.list.variable.Structure root = new syntax.list.variable.Structure("root", Structure.DOWN);
        root.setTemplate(pick);

        return root.make();
    }

    syntax.list.fixed.Structure statement(String name, Table table)
    {
        syntax.list.fixed.Structure statement = new syntax.list.fixed.Structure(name, Structure.ACROSS);
        syntax.name.Structure id = new syntax.name.Structure("name", Structure.ACROSS, table);
        statement.add(id);
        syntax.constant.Structure label = new syntax.constant.Structure("label", Structure.ACROSS, name);
        statement.add(label);

        return statement;
    }
}
