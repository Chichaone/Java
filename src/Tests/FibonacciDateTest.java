package Tests;

import Items.FibonacciDate;
import Items.Formula;
import Validation.StringValidation;
import calculation.CalcGeneral;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciDateTest {
    FibonacciDate _menuItem = new FibonacciDate();

    @Test
    public void MenuItemExit_getTitle()
    {
        assertEquals("Fibonacci date", _menuItem.getTitle());
    }

    @Test
    public void Fibonacci_calc_0() {
        assertEquals(0, CalcGeneral.calcFibonacci(0));
    }

    @Test
    public void Fibonacci_calc_4() {
        assertEquals(3, CalcGeneral.calcFibonacci(4));
    }

    @Test
    public void Fibonacci_calc_min1() {
        assertEquals(0, CalcGeneral.calcFibonacci(-1));
    }

    @Test
    public void Fibonacci_calc_1() {
        assertEquals(1, CalcGeneral.calcFibonacci(1));
    }

    @ParameterizedTest
    @ValueSource(strings = {"12.13.2020", "121212121212", "33.11.2020"})
    void Date_false(String candidate) {

        assertEquals("false", StringValidation.sDate(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"01.01.2001", "13.12.2020", "5.7.2012"})
    void Date_true(String candidate) {

        assertEquals( candidate, StringValidation.sDate(candidate));
    }
}
