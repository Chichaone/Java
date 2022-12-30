package Tests;

import Items.Formula;
import Validation.ValidationException;
import org.junit.jupiter.api.Test;
import calculation.CalcGeneral;

import static org.junit.jupiter.api.Assertions.*;

public class FormulaTest {

    Formula _menuItem = new Formula();

    @Test
    public void MenuItemExit_getTitle()
    {
        assertEquals("Formula", _menuItem.getTitle());
    }

    @Test
    public void Formula_calc() throws ValidationException {
        assertEquals(2.414213562373095, CalcGeneral.calcFormula(1, 2, 3));
    }

    @Test
    void Formula_calc_exception_y() {
        int x = 8;
        int y = -1;
        int z = 2;
        Throwable exception = assertThrows(Exception.class, () -> {
             CalcGeneral.calcFormula(x, y, z);
        });
        assertEquals("ERROR: Input in y > 0", exception.getMessage());
    }

    @Test
    void Formula_calc_exception_z() {
        int x = 8;
        int y = 3;
        int z = 0;
        Throwable exception = assertThrows(Exception.class, () -> {
             CalcGeneral.calcFormula(x, y, z);
        });
        assertEquals("ERROR: Input in z!= 0", exception.getMessage());
    }


}
