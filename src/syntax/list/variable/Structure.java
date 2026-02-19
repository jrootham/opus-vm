package syntax.list.variable;

import syntax.Edit;
import syntax.Syntax;

import java.util.Set;

public class Structure extends syntax.list.Structure
{
    public syntax.Structure template;

    public Structure(String name, int direction, syntax.Structure template)
    {
        super(name, direction);
        this.template = template;
    }

    @Override public String getType()
    {
        return "variable";
    }

    @Override public void saveData(Set<Syntax> visited)
    {
        connect(template);
        template.save(visited);
    }

    @Override
    public Edit make()
    {
        return new syntax.list.variable.Edit(this);
    }
}
