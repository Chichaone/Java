package Tests;

import Items.HelloWorld;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    HelloWorld _menuItem = new HelloWorld();

    @Test
    public void MenuItemExit_getTitle()
    {
        assertEquals("Hello world", _menuItem.getTitle());
    }
}
