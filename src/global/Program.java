package global;

import symbolPackage.Table;
import syntax.Edit;
import syntax.Structure;
import syntax.Syntax;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class Program
{
    Table table;
    Structure root;
    Edit edit;

    public Program(Table table, Structure root)
    {
        this.table = table;
        this.root = root;
        this.edit = root.make();
    }

    public Box display()
    {
        return edit.display();
    }

    public void save()
    {
        Set<Syntax> visited = new HashSet<Syntax>();

        this.table.save();
        this.root.save(visited);
        this.edit.save(visited);
    }
}
