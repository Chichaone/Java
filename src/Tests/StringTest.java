package Tests;

import Items.FibonacciDate;
import Items.Strings;
import Validation.StringValidation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {
    Strings _menuItem = new Strings();

    @Test
    public void MenuItemExit_getTitle()
    {
        assertEquals("Strings", _menuItem.getTitle());
    }

    @ParameterizedTest
    @ValueSource(strings = {"dsajhg@bk.ru", "mail@testing.com", "mail with@space.com"})
    void email_true(String candidate) {

        assertEquals("true", StringValidation.vEmail(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"dsajhg@bkru", "mailtesting.com", "mail with@space."})
    void email_false(String candidate) {

        assertEquals("false", StringValidation.vEmail(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+919367788755", "8989829304", "+16308520397"})
    void phoneNumber_true(String candidate) {

        assertEquals("true", StringValidation.vPhoneNumber(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"367788755", "+9829304", "+16308520"})
    void phoneNumber_false(String candidate) {

        assertEquals("false", StringValidation.vPhoneNumber(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"255.255.255.255", "0.0.0.0", "192.168.1.1"})
    void IpAddress_true(String candidate) {

        assertEquals("true", StringValidation.vIpAddress(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"256.256.256.256", "999.999.999.999", "1.2.3"})
    void IpAddress_false(String candidate) {

        assertEquals("false", StringValidation.vIpAddress(candidate));
    }

    @Test
    public void StCompareInsen_false() {
        String firstValue = "ddtyj";
        String secondValue = "dfgui9ij";

        assertEquals("false", StringValidation.vStCompareInsen(firstValue, secondValue));
    }

    @Test
    public void StCompareInsen_true() {
        String firstValue = "ddt";
        String secondValue = "ddt";

        assertEquals("true", StringValidation.vStCompareInsen(firstValue, secondValue));
    }

    @Test
    public void StCompareSen_false() {
        String firstValue = "ddtyj";
        String secondValue = "dfgui9ij";

        assertEquals("false", StringValidation.vStCompareSen(firstValue, secondValue));
    }

    @Test
    public void StCompareSen_true() {
        String firstValue = "ddt";
        String secondValue = "ddt";

        assertEquals("true", StringValidation.vStCompareSen(firstValue, secondValue));
    }

}
