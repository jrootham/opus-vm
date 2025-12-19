package syntax;

import javax.swing.*;

public abstract class Edit
{
    public Structure parent;

    public Edit(Structure parent)
    {
        this.parent = parent;
    }

    public Structure getParent()
    {
        return parent;
    }

    public abstract Box display();
}
