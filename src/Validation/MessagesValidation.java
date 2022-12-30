package Validation;

public class MessagesValidation {

    public static void vStValid(int val) throws ValidationException {
        switch (val) {
            case (0):
                throw new ValidationException("\nStrings are not equal, case insensitive");
            case (1):
                throw new ValidationException("\nStrings are not equal, case sensitive");
            case (2):
                throw new ValidationException("Strings are not shifters\n");
            case (3):
                throw new ValidationException("\nIt is not an email address\n");
            case (4):
                throw new ValidationException("\nIt is not a phone numbers\n");
            case (5):
                throw new ValidationException("\nIt is not an ip address(ipv4)\n");
            case (6):
                throw new ValidationException("ERROR: Input in y > 0");
            case (7):
                throw new ValidationException("ERROR: Input in z!= 0");
            case (8):
                throw new ValidationException("Error. 1 segment is after 2 segment");
            case (9):
                throw new ValidationException("Error. 3 segment is after 4 segment");
            case (10):
                throw new ValidationException("ERROR: Input in not integer!");
            case (11):
                throw new ValidationException("ERROR: Not Date");
            case (12):
                throw new ValidationException("\nStrings are not equal after check\n");
            default:
                System.out.println("Something went wrong");
        }
    }

}