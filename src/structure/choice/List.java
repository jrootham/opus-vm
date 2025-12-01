package structure.choice;

import edit.Edit;
import structure.Choice;

public class List extends Choice
{
    public List(String name)
    {
        super(name);
    }

    @Override
    public Edit make()
    {
        return new edit.List();
    }
}
