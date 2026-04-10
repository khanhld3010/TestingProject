package nextDayCalculator;

import java.util.Scanner;

public class NextDayCalculator {
    public String nextDay(int day, int month, int year) {
        int lastDayOfMonth = lastDayOfMonth(month, year);
        if (day < 1 || day > lastDayOfMonth) {
            return "Không tìm thấy ngày này trong tháng " + month;
        } else if (day == lastDayOfMonth && month == 12) {
            day = 1;
            month = 1;
            year = year + 1;
            return dayFormat(day, month, year);
        } else {
            day = day + 1;
            if (day > lastDayOfMonth) {
                day = 1;
                month = month + 1;
                return dayFormat(day, month, year);
            }
            return dayFormat(day, month, year);
        }
    }

    String dayFormat(int day, int month, int year) {
        return day + "-" + month + "-" + year;
    }

    public int lastDayOfMonth(int month, int year) {
        int lastDayOfMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDayOfMonth = 31;
                return lastDayOfMonth;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDayOfMonth = 30;
                return lastDayOfMonth;
            case 2:
                if (isLeapYear(year)) {
                    lastDayOfMonth = 29;
                    return lastDayOfMonth;
                } else {
                    lastDayOfMonth = 28;
                    return lastDayOfMonth;
                }
            default:
                return lastDayOfMonth;
        }
    }

    public boolean isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }
}
