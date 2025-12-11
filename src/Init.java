
public class Init
{
    public syntax.choose.Edit init()
    {
        syntax.choose.Structure root = new syntax.choose.Structure("Root");

        syntax.list.variable.Structure list = new syntax.list.variable.Structure("list");
        syntax.list.fixed.Structure tree = new syntax.list.fixed.Structure("Tree");
        root.add(list);
        root.add(tree);

        return new syntax.choose.Edit(root);
    }
}
