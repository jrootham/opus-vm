package utility;

import javax.swing.*;

import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.OK_OPTION;

public class Prompt
{
    String title;

    public Prompt(String title)
    {
        this.title = title;
    }

    public Object input()
    {
        return new JLabel("Input");
    }

    boolean validate()
    {
        return true;
    }

    void set()
    {
        System.out.println("Setting value");
    }

    public void prompt() {
        int result = JOptionPane.showConfirmDialog(null, input(), this.title, OK_CANCEL_OPTION);

        if (result == OK_OPTION) {
            if (validate()) {
                set();
            } else {
                prompt();
            }
        }
    }
}

/*
    public JPanel prompt()

    {
        JPanel result = new JPanel();
        JButton button = new JButton(this.getName());
        result.add(button);

        /*
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
                    //                  tree.choose.set(pick.make());
                }
            }

         */

