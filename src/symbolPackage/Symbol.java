package symbolPackage;

import java.util.UUID;

public class Symbol
{
    UUID id;
    Table table;

    public Symbol(Table table, String name)
    {
        this.table = table;
        this.id = UUID.randomUUID();
        table.insert(this.id, name);
    }

    public Symbol(Table table, UUID id)
    {
        this.table = table;
        this.id = id;
    }

    public UUID getId()
    {
        return id;
    }

    public String getName()
    {
        return this.table.getName(this.id);
    }
}
