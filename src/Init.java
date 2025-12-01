import edit.Choose;
import structure.choice.FixedList;
import structure.choice.List;

public class Init
{
    public Choose init()
    {
        structure.Choose root = new structure.Choose("Root");
        structure.choice.List list = new structure.choice.List("List");
        structure.choice.FixedList tree = new structure.choice.FixedList("Tree");
        root.add(list);
        root.add(tree);

        return new edit.Choose(root);
    }
}
