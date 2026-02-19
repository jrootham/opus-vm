package syntax.list.fixed;

import syntax.Syntax;

import javax.swing.*;

public class Edit extends syntax.list.Edit
{
    syntax.list.fixed.Structure parent;

    Edit(Structure parent)
    {
        super(parent);
        this.parent = parent;
    }

    @Override
    public syntax.Structure getParentBase()
    {
        return this.parent;
    }

    public Box display()
    {
        Box result = super.display();

        result.add((Box.createGlue()));

        return result;
    }
}
