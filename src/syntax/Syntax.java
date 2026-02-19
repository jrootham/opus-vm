package syntax;

import symbolPackage.Symbol;

import java.util.Set;
import java.util.UUID;

public abstract class Syntax
{
    public UUID id;

    public Syntax()
    {
        this.id = UUID.randomUUID();
    }

    public Syntax(UUID id)
    {
        this.id = id;
    }

    public abstract String getType();

    public boolean notVisited(Set<Syntax> visited)
    {
        if (visited.contains(this))
        {
            return false;
        }
        else
        {
            visited.add(this);
            return true;
        }
    }

    public void connect(Syntax other)
    {
        System.out.println("Connect " + this.id + " " + this.getType() + " " + other.id + " " + other.getType());
    }

    public void connect(Symbol symbol)
    {
        System.out.println("Symbol " + this.id + " " + this.getType() + " " + symbol.getId());
    }

    public abstract void saveData(Set<Syntax> visited);

    public abstract void saveContext(Set<Syntax> visited);

    public void save(Set<Syntax> visited)
    {
        if (notVisited(visited))
        {
            System.out.println(this.id.toString() + " " + this.getType());
            this.saveContext(visited);
            this.saveData(visited);
        }
    }
}
