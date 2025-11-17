public class Init
{
    structure.Base  base;
    edit.Base edit;
    Init()
    {
        base = new structure.Base();
        edit = new edit.Base(base);
        return edit;
    }
}
