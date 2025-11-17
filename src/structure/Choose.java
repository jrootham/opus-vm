package structure;

public class Choose
{
    String name;
    Choice choiceList;

    Choose(String name)
    {
        this.name = name;
        this.choiceList = null;
    }

    String getName()
    {
        return this.name;
    }

    void append(Choice choice)
    {
        if (this.choiceList)
        {
            this.choiceList.append(choice);
        }
        else
        {
            this.choiceList = choice;
        }
    }
}
