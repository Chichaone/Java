package Items;

import IO.Output;
import Menu.MenuItem;

public class HelloWorld extends MenuItem {
    public HelloWorld()
    {
        _title = "Hello world";
    }
    public void execute() {
        Output.println("Hello world!");
    }
}
