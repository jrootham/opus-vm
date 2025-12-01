package structure;

import utility.Named;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static javax.swing.JOptionPane.*;

public class Choose extends Named
{
    Choice choiceList;

    public Choose(String name)
    {
        super(name);
        this.choiceList = null;
    }

    public void add(Choice choice)
    {
        if (this.choiceList != null)
        {
            this.choiceList.add(choice);
        }
        else
        {
            this.choiceList = choice;
        }
    }

    public JPanel display(edit.Choose choose)
    {
        JPanel result = new JPanel();
        JButton button = new JButton(this.getName());
        result.add(button);

        ActionListener listen = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Map<String, Choice> itemMap = new HashMap<String, Choice>();

                ArrayList<String> nameList = new ArrayList<String >();
                ArrayList<Choice> itemList = new ArrayList<Choice>();

                Choice item = choiceList;

                while (item != null)
                {
                    itemList.add(item);
                    nameList.add((item.getName()));

                    item = item.next;
                }

                String[] nameArray =  new String[0];
                nameArray =  nameList.toArray(nameArray);
                JComboBox dropDown = new JComboBox(nameArray);

                int result = JOptionPane.showConfirmDialog(null, dropDown, "Choice", OK_CANCEL_OPTION);

                if (result == OK_OPTION)
                {
                    int pickIndex = dropDown.getSelectedIndex();
                    Choice pick = itemList.get(pickIndex);
System.out.println(pick);
  //                  choose.set(pick.make());
                }
            }
        };

        button.addActionListener(listen);

        return result;
    }
}
