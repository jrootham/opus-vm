package structure;

public class Choice extends Base
{
    Choice next;

    Choice()
    {
        this.next = null;
    }

    void  append(Choice choice)
    {
        this.next = choice;
    }
}
