import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class bootstrap
{
    public static void main
    (
        String args[]
    )
    {
        JFrame frame = new JFrame("Bootstrap editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000,700);
        display.Tree tree = new display.Tree();
        frame.getContentPane().add(tree);
        frame.setVisible(true);
    }
}

