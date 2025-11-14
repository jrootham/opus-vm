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
        frame.setSize(300,300);
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        JTree tree = new JTree(root);
        frame.getContentPane().add(tree);
        frame.setVisible(true);
    }
}

