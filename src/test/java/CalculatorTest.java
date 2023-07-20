import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;

        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubstract(){
      int expected = 2;
      int actual = calculator.subtract(3, 1);

      assertEquals(expected, actual);

      assertEquals(-2, calculator.subtract(5,7));
    }

    @Test
    public void testMultiply(){
      assertEquals(10,calculator.multiply(5, 2));
      assertEquals(49,calculator.multiply(7, 7), " multiply method ");
    }

    @Test
    public void testDivide(){
      assertEquals(5,calculator.divide(15,3));
      assertEquals(1.2,calculator.divide(6,5), 0.0001);
    }
}
