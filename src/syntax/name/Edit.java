package syntax.name;

import symbolPackage.Symbol;
import symbolPackage.Table;
import syntax.Syntax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class Edit extends syntax.Edit
{
    static int ENDSPACE = 10;

    Structure parent;
    symbolPackage.Symbol symbol;

    public Edit(Structure parent)
    {
        super();

        this.parent = parent;
        this.symbol = null;
    }

    public Table getTable()
    {
        return this.parent.table;
    }

    public void set(Symbol symbol)
    {
        this.symbol = symbol;
    }

    @Override
    public syntax.Structure getParentBase()
    {
        return this.parent;
    }

    public Box display()
    {
        Box result = new Box(parent.direction);

        if (this.symbol != null)
        {
            result.add(new JLabel(this.symbol.getName()));
            result.add(Box.createHorizontalStrut(Edit.ENDSPACE));
        }
        else
        {
            Box buttons = new Box(BoxLayout.X_AXIS);

            JButton create = new JButton("Create");
            create.addActionListener(new Create(this));
            buttons.add(create);

            JButton select = new JButton("Select");
            select.addActionListener(new Select(this));
            buttons.add(select);

            result.add(buttons);
        }

        result.add(Box.createHorizontalStrut(Edit.ENDSPACE));
        return result;
    }

    @Override
    public void saveData(Set<Syntax> visited)
    {
        connect(this.symbol);
    }

    class Create implements ActionListener
    {
        Edit current;

        public Create(Edit current)
        {
            this.current = current;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            symbolPackage.Edit edit = new symbolPackage.Edit();
            edit.insert(current);
        }
    }

    class Select implements ActionListener
    {
        Edit current;

        public Select(Edit current)
        {
            this.current = current;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            symbolPackage.Edit edit = new symbolPackage.Edit();
            edit.select(current);
        }
    }
}