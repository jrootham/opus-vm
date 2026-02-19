package syntax;

import javax.swing.*;
import java.util.Set;
import java.util.UUID;

public abstract class Edit extends Syntax
{
    public Edit()
    {
    }

    public Edit(UUID id)
    {
        super(id);
    }

    public abstract Structure getParentBase();

    public String getType()
    {
        return "edit_" + this.getParentBase().getType();
    }

    @Override
    public void saveContext(Set<Syntax> visited)
    {
        this.connect(this.getParentBase());
        this.getParentBase().save(visited);
    }

    public abstract Box display();
}
