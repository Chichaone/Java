package Validation;

import static Items.FibonacciDate.executeThree;

public class DataValidation {
    public static int valueData(int dataRes, String res) throws ValidationException {
            switch (res) {
                case "result": {
                    if (dataRes > 0) {
                        MessagesValidation.vStValid(8);
                        executeThree();
                    }
                    break;
                }

                case "result2": {
                    if (dataRes > 0) {
                        MessagesValidation.vStValid(9);
                        executeThree();
                    }
                    break;
                }
            }

        return dataRes;
    }
}
