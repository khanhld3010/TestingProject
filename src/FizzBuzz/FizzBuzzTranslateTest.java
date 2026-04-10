package FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
    @Test
    void translateFizzBuzz() {
        int number = 3;
        String expected = "Fizz";
        String result = fizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void translateFizzBuzz2() {
        int number = 18;
        String expected = "Fizz";
        String result = fizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void translateFizzBuzz3() {
        int number = 5;
        String expected = "Buzz";
        String result = fizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void translateFizzBuzz4() {
        int number = 50;
        String expected = "Buzz";
        String result = fizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void translateFizzBuzz5() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = fizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void translateFizzBuzz6() {
        int number = 26;
        String expected = "Hai Sáu";
        String result = fizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void translateNumberToString() {
        int number = 56;
        String expected = "Năm Sáu";
        String result = fizzBuzzTranslate.translateNumberToString(number);
        assertEquals(expected,result);
    }
    @Test
    void translateNumberToString2() {
        int number = 43;
        String expected = "Bốn Ba";
        String result = fizzBuzzTranslate.translateNumberToString(number);
        assertEquals(expected,result);
    }
    @Test
    void translateNumberToString3() {
        int number = 26;
        String expected = "Hai Sáu";
        String result = fizzBuzzTranslate.translateNumberToString(number);
        assertEquals(expected,result);
    }
}