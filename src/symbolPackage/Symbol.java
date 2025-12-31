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

    public void setName(String name)
    {
        this.table.rename(this.id, name);
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
