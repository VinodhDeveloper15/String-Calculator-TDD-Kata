import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    void testEmptyStringReturnsZero() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    void testAdd_SingleNumber_ShouldReturnTheNumber() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(5, calculator.add("5"));
    }

    @Test
    void testAdd_TwoNumbers_ShouldReturnSum() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
    }


}