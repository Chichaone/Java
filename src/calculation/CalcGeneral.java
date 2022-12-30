package calculation;

import Validation.ValidationException;
import static Validation.ArithmeticValidation.valueYZ;


public class CalcGeneral {

    public static double calcFormula (int x, int y, int z) throws ValidationException {
        valueYZ(y,"y");
        valueYZ(z,"z");

        return ((x + Math.sqrt(y)) % z);
    }


    //функция для расчета последовательности Фибоначчи через рекурсию
    public static int calcFibonacci(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else {
            return (calcFibonacci(index - 1) + calcFibonacci(index - 2));
        }
    }
}
