package structure;

import edit.Edit;
import utility.Named;

public class Choice extends Named
{
    Choice next;

    public Choice(String name)
    {
        super(name);
        this.next = null;
    }

    public void  add(Choice choice)
    {
        if (this.next != null)
        {
            this.next.add(choice);
        }
        else
        {
            this.next = choice;
        }
    }

    public Edit make()
    {
        return null;
    }
}
