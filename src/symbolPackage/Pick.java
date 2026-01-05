package symbolPackage;

import java.util.UUID;

public class Pick
{
    Table table;
    UUID id;
    String name;

    public Pick(Table table, UUID id, String name)
    {
        this.table = table;
        this.id = id;
        this.name = name;
    }

    Symbol make()
    {
        return new Symbol(this.table, this.id);
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}
