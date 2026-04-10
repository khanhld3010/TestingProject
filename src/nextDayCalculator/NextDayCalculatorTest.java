package nextDayCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    NextDayCalculator nextDayCalculator = new NextDayCalculator();
    @Test
    void nextDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2-1-2018";
        String result = nextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void nextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1-2-2018";
        String result = nextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void nextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1-5-2018";
        String result = nextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void nextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1-3-2018";
        String result = nextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void nextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1-3-2020";
        String result = nextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void nextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1-1-2019";
        String result = nextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }


    @Test
    void lastDayOfMonth() {
        int month = 10;
        int year = 2018;
        int expected = 31;
        int result = nextDayCalculator.lastDayOfMonth(month,year);
        assertEquals(expected,result);
    }
    @Test
    void lastDayOfMonth2() {
        int month = 6;
        int year = 2018;
        int expected = 30;
        int result = nextDayCalculator.lastDayOfMonth(month,year);
        assertEquals(expected,result);
    }
    @Test
    void lastDayOfMonth3() {
        int month = 2;
        int year = 2020;
        int expected = 29;
        int result = nextDayCalculator.lastDayOfMonth(month,year);
        assertEquals(expected,result);
    }
    @Test
    void lastDayOfMonth4() {
        int month = 2;
        int year = 1700;
        int expected = 28;
        int result = nextDayCalculator.lastDayOfMonth(month,year);
        assertEquals(expected,result);
    }

    @Test
    void isLeapYear() {
        int year = 2000;
        boolean expected = true;
        boolean result = nextDayCalculator.isLeapYear(year);
        assertEquals(expected,result);
    }
    @Test
    void isLeapYear2() {
        int year = 2028;
        boolean expected = true;
        boolean result = nextDayCalculator.isLeapYear(year);
        assertEquals(expected,result);
    }
    @Test
    void isLeapYear3() {
        int year = 1800;
        boolean expected = false;
        boolean result = nextDayCalculator.isLeapYear(year);
        assertEquals(expected,result);
    }
}