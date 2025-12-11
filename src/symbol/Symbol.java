package symbol;

import java.util.UUID;

public class Symbol
{
    UUID id;
    String name;

    public Symbol(String name)
    {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public UUID getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}
