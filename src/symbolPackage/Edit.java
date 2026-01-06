package symbolPackage;

import utility.Named;
import utility.Prompt;

import javax.swing.*;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.UUID;
import java.util.Vector;

public class Edit
{
    public void insert(syntax.name.Edit current)
    {
        PromptName prompt = new PromptName(current);

        prompt.prompt();
    }

    class PromptName extends Prompt
    {
        syntax.name.Edit current;
        JTextField field;

        public PromptName(syntax.name.Edit current)
        {
            super("Input Name");
            this.current = current;
            this.field  = new JTextField();
        }

        @Override
        public Object input()
        {
            return this.field;
        }

        @Override
        public boolean validate()
        {
            String name = this.field.getText();
            boolean found = current.getTable().hasName(name);
            if (found)
            {
                JOptionPane.showMessageDialog(null, name + " already exists");
            }

            return !found;
        }

        @Override
        public void set()
        {
            String name = this.field.getText();
            Table table = this.current.getTable();

            this.current.set((new Symbol(table, name)));
            main.bootstrap.refresh();
        }
    }

    public void select(syntax.name.Edit current)
    {
        PromptPick prompt = new PromptPick("Select Name", current);

        prompt.prompt();
    }

    class PromptPick extends Prompt
    {
        Vector<Pick> sorted;
        public JComboBox<Pick> dropDown;
        syntax.name.Edit current;

        public PromptPick(String title, syntax.name.Edit current)
        {
            super(title);
            Table table = current.getTable();
            this.sorted = table.getSorted();
            this.current = current;

            this.dropDown = new JComboBox<>(this.sorted);
        }

        @Override public Object input()
        {
            return this.dropDown;
        }

        @Override
        public void set()
        {
            Pick picked = this.dropDown.getItemAt(this.dropDown.getSelectedIndex());
            this.current.set(picked.make());
            main.bootstrap.refresh();
        }
    }

    public static void rename(Symbol symbol)
    {

    }
}
