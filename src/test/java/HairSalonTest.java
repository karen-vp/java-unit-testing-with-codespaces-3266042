import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        String[] expected = new String[] { "Monday", "Tuesday" };

        String[] actual = hairSalon.getOpeningDays();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSalonIsOpenOnMonday() {
        assertTrue(hairSalon.isOpen("Monday"));
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
        assertFalse(hairSalon.isOpen("Wednesday"));
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> hairSalon.isOpen("Hello"));

        String expected = "The weekday argument must end in the letters 'day'";

        String actual = exception.getMessage();

        assertEquals(expected, actual);
    }

    @Test
    public void testApplyDiscount() {
        Calculator calculator = new Calculator();
        assumeTrue(calculator.divide(hairSalon.getHaircutPrice(), 2) == 15, "La prueba se ignora porque la condición es falsa.");
         

        // Código de prueba que se ejecutará si la condición de assumeTrue es verdadera.
        int expected = 20;
        int actual = hairSalon.applyDiscount();

        assertEquals(expected, actual);
    }

}