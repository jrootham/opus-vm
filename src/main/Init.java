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

        syntax.list.fixed.Structure variable = statement("Variable", table);
        variable.add(new syntax.name.Structure("ListName", Structure.ACROSS, table));

        syntax.list.fixed.Structure fixed = statement("Fixed", table);

        syntax.choose.Structure template = new syntax.choose.Structure("template", Structure.ACROSS);
        template.add(new syntax.constant.Structure("templateConstant", Structure.ACROSS));
        template.add(new syntax.name.Structure("templateName", Structure.ACROSS, table));

        syntax.list.variable.Structure list
                = new syntax.list.variable.Structure("FixedParameters", Structure.ACROSS, template);

        fixed.add(list);

        syntax.list.fixed.Structure choose = statement("Choose", table);
        syntax.name.Structure choiceTemplate = new syntax.name.Structure("choice", Structure.ACROSS, table);

        syntax.list.variable.Structure choiceList
                = new syntax.list.variable.Structure("choiceList", Structure.ACROSS, choiceTemplate);
        choose.add(choiceList);

        pick.add(constant);
        pick.add(variable);
        pick.add(fixed);
        pick.add(choose);

        syntax.list.variable.Structure root = new syntax.list.variable.Structure("root", Structure.DOWN, pick);

        return root.make();
    }

    syntax.list.fixed.Structure statement(String name, Table table)
    {
        syntax.list.fixed.Structure statement = new syntax.list.fixed.Structure(name, Structure.ACROSS);
        syntax.name.Structure id = new syntax.name.Structure("name", Structure.ACROSS, table);
        statement.add(id);
        syntax.compile.Structure label = new syntax.compile.Structure("label", Structure.ACROSS, name);
        statement.add(label);

        return statement;
    }
}
