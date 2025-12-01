package structure;

import utility.Named;

public class Item extends Named
{
    Item list;

    public Item(String name)
    {
        super(name);
        this.list = null;
    }

    public void add(Item next)
    {
        if (this.list != null)
        {
            this.list.add(next);
        }
        else
        {
            this.list = next;
        }
    }
}
