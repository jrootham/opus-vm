package symbolPackage;

import utility.Prompt;

import javax.swing.*;

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
        public void set()
        {
            String name = this.field.getText();
            Table table = this.current.getTable();

            this.current.set((new Symbol(table, name)));
            main.bootstrap.refresh();
        }
    }

    public  Symbol select(syntax.name.Edit current)
    {
        return null;
    }

    public static void rename(Symbol symbol)
    {

    }
}
