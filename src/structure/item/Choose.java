package structure.item;

import structure.Choice;
import structure.Item;

public class Choose extends Item
{
    Choice choiceList;

    public Choose(String name)
    {
        super(name);
        this.choiceList = null;
    }

    public void add(Choice choice)
    {
        if (this.choiceList != null)
        {
            this.choiceList.add(choice);
        }
        else
        {
            this.choiceList = choice;
        }
    }
}
