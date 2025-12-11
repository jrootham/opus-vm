package utility;

public class Named
{
    String name;

    public Named()
    {
        this.name = null;
    }

    public Named(String name)
    {
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
