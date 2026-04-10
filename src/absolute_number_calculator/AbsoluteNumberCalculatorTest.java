package absolute_number_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    AbsoluteNumberCalculator absoluteNumberCalculator = new AbsoluteNumberCalculator();

    @Test
    void findAbsolute() {
        int number = 0;
        int expected = 0;
        int result = absoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @Test
    void findAbsolute1() {
        int number = 1;
        int expected = 1;
        int result = absoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @Test
    void findAbsolute2() {
        int number = -1;
        int expected = 1;
        int result = absoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
}