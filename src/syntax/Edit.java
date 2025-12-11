package syntax;

import javax.swing.*;

public abstract class Edit
{
    public Structure structure;

    public Edit(Structure structure)
    {
        this.structure = structure;
    }

    public abstract JPanel display();
}
