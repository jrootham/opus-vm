package utility;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class Test
{
    public static void main(String args[])
    {
        Value value = new Value();
        ArrayList<TNamed> namedList = new ArrayList<TNamed>();
        namedList.add(new TNamed("First", "a"));
        namedList.add(new TNamed("Second", "b"));
        namedList.add(new TNamed("Third", "c"));

        JFrame frame = new JFrame("Test Prompt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000,700);

        JPanel panel = new JPanel();
        JButton button = new  JButton("Test");
        JButton other = new  JButton("Named");

        class Listener implements ActionListener
        {
            public Value value;

            public Listener(Value value)
            {
                this.value = value;
            }

            @Override
            public void actionPerformed(ActionEvent e)
            {
                Prompt prompt = new TestPrompt("Test", value);
                prompt.prompt();
            }
        }

        class Listen implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                TNamePrompt prompt = new TNamePrompt(namedList);
                prompt.prompt();
            }
        }

        button.addActionListener(new Listener(value));
        other.addActionListener(new Listen());

        panel.add(button);
        panel.add(other);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}

class TNamePrompt extends NamePrompt
{
    ArrayList<TNamed> list;

    TNamePrompt(ArrayList<TNamed> list)
    {
        super("Test Named", makePass(list));
        this.list = list;
    }

    static ArrayList<Named> makePass(ArrayList<TNamed> list)
    {
        ArrayList<Named> pass = new ArrayList<Named>();
        Iterator<TNamed> iterator = list.iterator();
        while (iterator.hasNext())
        {
            pass.add(iterator.next());
        }

        return pass;
    }

    @Override
    public void set()
    {
        int index = dropDown.getSelectedIndex();
        TNamed picked =  list.get(index);
        JOptionPane.showMessageDialog(null, picked);
    }
}

class Value
{
    public int value;

    public Value()
    {
        this.value = 0;
    }
}

class TNamed extends Named
{
    public String value;

    public TNamed(String name, String value)
    {
        super(name);
        this.value = value;
    }
}

class TestPrompt extends Prompt
{
    JComboBox dropdown;
    Value dest;

    public TestPrompt(String title, Value dest)
    {
        super(title);
        String[] values = {"Good", "Bad"};
        this.dropdown = new JComboBox<String>(values);
        this.dest = dest;
    }

    @Override
    public Object input()
    {
        return this.dropdown;
    }

    @Override
    public boolean validate()
    {
        if (0 == this.dropdown.getSelectedIndex())
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Bad value selected");
            return false;
        }
    }

    @Override
    public void set()
    {
        this.dest.value = this.dest.value + 1;
        JOptionPane.showMessageDialog(null, Integer.valueOf(this.dest.value));
    }
}