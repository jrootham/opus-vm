package structure.item;

import structure.Item;

public class Terminal extends Item
{
    String value;

    public Terminal(String value)
    {
        super(value);
        this.value = value;
    }
}
