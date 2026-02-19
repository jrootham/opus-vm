package test;

import global.Program;
import main.Init;
import syntax.Edit;

public class tsave
{
    public static void main
    (
        String args[]
    )
    {
        Init init = new Init();
        Program test = init.init();
        test.save();

        System.out.println(test);
    }
}
