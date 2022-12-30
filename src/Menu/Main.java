package Menu;

public class Main {
    public static void main(String[] args) {

            if (args.length == 0) {
                while (true) {
                    Menu.print();
                    MenuItem task = Menu.getChoseMenuNum();
                    task.execute();
                }
            }
    }
}
