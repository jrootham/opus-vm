package structure;

public class FixedList
{
    Item list;

    public FixedList()
    {
        list = null;
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
