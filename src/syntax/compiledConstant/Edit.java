package syntax.compiledConstant;

import syntax.Syntax;

import javax.swing.*;
import java.util.Set;

public class Edit extends syntax.Edit
{
    Structure parent;

    public Edit(Structure parent)
    {
        super();
        this.parent = parent;
    }

    @Override public void saveData(Set<Syntax> visited)
    {
    }

    @Override
    public syntax.Structure getParentBase() {
        return this.parent;
    }

    @Override public Box display()
    {
        Box result = new Box(this.parent.direction);

        result.add(new JLabel(this.parent.value));
        result.add(Box.createGlue());

        return result;
    }

}
