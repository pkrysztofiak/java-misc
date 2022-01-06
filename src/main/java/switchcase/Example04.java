package switchcase;

public class Example04 {

    public static void main(String[] args) {
        System.out.println(index("Monday"));
    }

    public static int index(String day) {
        //Does not compile when statement changed to expression
//        int index = switch (day) {
//            case "Monday" -> {return 1;}
//            case "Tuesday" -> {return 2;}
//            case "Wednesday" -> {return 3;}
//            case "Thursday" -> {return 4;}
//            case "Friday" -> {return 5;}
//            case "Saturday" -> {return 6;}
//            case "Sunday" -> {return 7;}
//            default -> {return -1;}
//        };
//        return index;

        int index = switch (day) {
            case "Monday": yield 1;
            case "Tuesday": yield 2;
            case "Wednesday": yield 3;
            case "Thursday": yield 4;
            case "Friday": yield 5;
            case "Saturday": yield 6;
            case "Sunday": yield 7;
            default: yield -1;
        };

        return index;
    }
}
