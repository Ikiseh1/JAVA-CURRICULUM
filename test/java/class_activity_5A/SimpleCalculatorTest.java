package class_activity_5A;

import org.junit.jupiter.api.Test;
import week_3.class_activity_5A.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void itShouldAddTwoNumbers() {
        SimpleCalculator calculator = new SimpleCalculator();

        int actual = calculator.itShouldAddTwoNumbers(2,2);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void itShouldPrintHelloWorld(){
        SimpleCalculator cal = new SimpleCalculator();

        String actual = cal.hello();
        String expected = "Hello World";
        assertEquals(expected, actual);
    }
}