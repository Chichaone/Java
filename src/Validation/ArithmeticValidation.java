package Validation;

public class ArithmeticValidation {

    public static int valueYZ(int valOne, String val) throws ValidationException {
            switch (val) {
                case "y": {
                    if (valOne < 0) {
                        MessagesValidation.vStValid(6);
                    }
                    break;
                }
                case "z": {
                    if (valOne == 0) {
                        MessagesValidation.vStValid(7);
                    }
                    break;
                }
            }
        return valOne;
    }
}
