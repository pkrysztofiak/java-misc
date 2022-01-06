package switchcase;

public class Example01 {

    public static void main(String[] args) {
        System.out.println(days(Month.FEBRUARY));
    }

    public static int days(Month month) {
        var result = switch (month) {
            case FEBRUARY -> {
                yield 28;
            }
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
        };
        return result;
    }
}