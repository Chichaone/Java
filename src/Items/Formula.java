package Items;

import IO.Input;
import IO.Output;
import Menu.MenuItem;

import java.text.DecimalFormat;

import static calculation.CalcGeneral.calcFormula;


//1 лаб - 11 вариант
public class Formula extends MenuItem {
    public Formula()
    {
        _title = "Formula";
    }
    public void execute() {
        executeTwo();
    }
    public void executeTwo() {
        System.out.println("Enter x, y, z for the formula: (X+sqrt(Y)) % Z ");
        try {
            int x = Input.getInt("X");
            int y = Input.getInt("Y");
            int z = Input.getInt("Z");

            double result = calcFormula(x, y, z);

            DecimalFormat df = new DecimalFormat("0.000");

            if (!Double.isNaN(result)) {
                Output.println("Result:" + df.format(result));
            } else {
                System.out.println("Result: Not a number, check the numbers you enter");
                executeTwo();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            execute();
        }

    }
}
