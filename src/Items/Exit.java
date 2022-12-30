package Items;

import Menu.MenuItem;

public class Exit extends MenuItem {

    public Exit()
    {
        _title = "Exit";
    }
    public void execute() {
        System.exit(0);
    }
}
