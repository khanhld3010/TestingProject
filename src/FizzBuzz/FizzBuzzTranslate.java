package FizzBuzz;

public class FizzBuzzTranslate {
    String translateFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return translateNumberToString(number);
    }

    public String translateNumberToString(int number) {
        int tensNumber = number / 10;
        String tensNumberString = translateUnitNumberToString(tensNumber);
        int unitNumber = number % 10;
        String unitNumberString = translateUnitNumberToString(unitNumber);
        return tensNumberString +" " +unitNumberString;
    }

    private String translateUnitNumberToString(int number) {
        return switch (number) {
            case 1 -> "Một";
            case 2 -> "Hai";
            case 3 -> "Ba";
            case 4 -> "Bốn";
            case 5 -> "Năm";
            case 6 -> "Sáu";
            case 7 -> "Bảy";
            case 8 -> "Tám";
            case 9 -> "Chín";
            case 0 -> "Không";
            default -> null;
        };
    }
}
