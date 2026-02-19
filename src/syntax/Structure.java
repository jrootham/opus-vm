package syntax;

import javax.swing.*;
import java.util.Set;
import java.util.UUID;

public abstract class Structure extends Named
{
    public static int ACROSS = BoxLayout.X_AXIS;
    public static int DOWN = BoxLayout.Y_AXIS;

    public int direction = ACROSS;

    public Structure(String name, int direction)
    {
        super(name);

        this.direction = direction;
    }

    public Structure(UUID id, String name, int direction)
    {
        super(id, name);

        this.direction = direction;
    }

    public abstract String getType();

    @Override
    public void saveContext(Set<Syntax>  visited)
    {
        System.out.println(this.getName());
    }


    public Box display()
    {
        return new Box(BoxLayout.X_AXIS);
    }

    public abstract Edit make();
}
