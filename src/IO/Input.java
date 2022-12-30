package IO;

import java.util.Scanner;

public class Input {
    public static int getInt(String varName)  {
        Scanner scan = new Scanner(System.in);
        Output.print("Enter "+varName+": ");

        while(!scan.hasNextInt())
        {
            scan.nextLine();
            Output.println("ERROR: Input in not integer!");
            Output.print("Enter "+varName+": ");
        }

        return scan.nextInt();
    }

    public static String getStr()
    {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
