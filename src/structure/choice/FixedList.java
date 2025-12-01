package structure.choice;

import edit.Edit;
import structure.Choice;
import utility.Named;

public class FixedList extends Choice
{
    public FixedList(String name)
    {
        super(name);
    }

    @Override
    public Edit make()
    {
        return new edit.FixedList();
    }

}
