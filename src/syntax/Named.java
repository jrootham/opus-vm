package syntax;

import java.util.UUID;

public abstract class Named extends Syntax
{
    String name;

    public Named()
    {
        super();
        this.name = null;
    }

    public Named(String name)
    {
        super();
        this.name = name;
    }

    public Named(UUID id, String name)
    {
        super(id);
        this.name = name;
    }

    public boolean hasName()
    {
        return this.name != null;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public String toString()
    {
        return this.name;
    }
}
