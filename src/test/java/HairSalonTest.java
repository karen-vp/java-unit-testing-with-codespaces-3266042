import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        assertArrayEquals(new String[]{"Monday", "Tuesday"}, hairSalon.getOpeningDays());
    }

    @Test
    public void testSalonIsOpenOnMonday() {
        assertTrue(hairSalon.isOpen("Monday"));
        assertTrue(hairSalon.isOpen("Tuesday"));
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
         assertFalse(hairSalon.isOpen("Wednesday"));
         assertFalse(hairSalon.isOpen("Sunday"));
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        assertThrows(IllegalArgumentException.class, ()->{hairSalon.isOpen("hola");});

        // Exception with a message
        Exception exception = assertThrows(IllegalArgumentException.class, ()->{hairSalon.isOpen("vaca");});
    
        String expected = "The weekday argument must end in the letters 'day'";

        String actual = exception.getMessage();

        assertEquals(expected,actual);
    }

}