package Items;

import IO.Input;
import Menu.MenuItem;
import Validation.StringValidation;

public class Strings extends MenuItem {
    public Strings()
    {
        _title = "Strings";
    }
    public void execute() {
        executeFour();
    }
    // функция где используется оператор throws для того, чтобы объявляемый меод мог генерировать исключения, которые он не обрабатывает
    public static void executeFour() {

        System.out.println("Enter a first string: ");
        java.lang.String stValOne = Input.getStr();
        System.out.println("Enter a second string: ");
        java.lang.String stValTwo = Input.getStr();

        StringValidation.vStCompareInsen(stValOne, stValTwo);
        StringValidation.vStCompareSen(stValOne, stValTwo);
        StringValidation.vSpaceDelete(stValOne, stValTwo);
        StringValidation.vStReverse(stValOne, stValTwo);
        StringValidation.vEmail(stValOne);
        StringValidation.vEmail(stValTwo);
        StringValidation.vPhoneNumber(stValOne);
        StringValidation.vPhoneNumber(stValTwo);
        StringValidation.vIpAddress(stValOne);
        StringValidation.vIpAddress(stValTwo);

    }
}
