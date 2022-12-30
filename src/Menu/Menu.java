package Menu;

import IO.Input;
import IO.Output;
import Items.Exit;
import Items.FibonacciDate;
import Items.Formula;
import Items.HelloWorld;
import Items.Strings;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static List<MenuItem> _menuItems = null;

    public static List<MenuItem> getMenuNum() {
        if (_menuItems == null) {
            _menuItems = new ArrayList<MenuItem>();
            _menuItems.add(new Exit());
            _menuItems.add(new HelloWorld());
            _menuItems.add(new Formula());
            _menuItems.add(new FibonacciDate());
            _menuItems.add(new Strings());
        }
        return _menuItems;
    }

    public static void print() {
        List<MenuItem> menuItems = getMenuNum();
        for (int iMenu = 0; iMenu < menuItems.size(); iMenu++) {
            Output.println("[" + iMenu + "] " + menuItems.get(iMenu).getTitle());
        }
    }

    public static MenuItem getChoseMenuNum() {

        List<MenuItem> menuItems = getMenuNum();
        int MenuNum = 0;
        while (true) {
            MenuNum = Input.getInt("number of menu item");
            if ((MenuNum < 0) || (MenuNum >= menuItems.size())) {
                Output.println("\nYou have entered an incorrect menu item number.\nPlease try again.");
                continue;
            }
            return menuItems.get(MenuNum);
        }
    }
}
