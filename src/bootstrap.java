
import javax.swing.*;

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

        Init init = new Init();
        syntax.choose.Edit tree = init.init();

        frame.getContentPane().add(tree.display());
        frame.setVisible(true);
    }
}

