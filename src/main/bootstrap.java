package main;

import syntax.Edit;

import javax.swing.*;
import java.awt.*;

public class bootstrap
{

    public static JFrame frame;
    public static Edit edit;

    public static void main
    (
        String args[]
    )
    {
        frame = new JFrame("Bootstrap editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000,700);

        Init init = new Init();
        edit = init.init();
        display();
    }

    public static void refresh()
    {
        System.out.println("refresh");
        frame.getContentPane().removeAll();
        display();
    }

    public static void display()
    {
        frame.setVisible(true);
        System.out.println(edit);
        frame.getContentPane().add(edit.display());
        frame.revalidate();
        frame.repaint();
    }
}

