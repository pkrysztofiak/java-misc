package switchcase;

public class Example03 {

    public static void main(String[] args) {
        System.out.println(index("Monday"));
    }

    public static int index(String day) {
        //Can return from statement statement like in classical switch..case
        switch (day) {
            case "Monday" -> {return 1;}
            case "Tuesday" -> {return 2;}
            case "Wednesday" -> {return 3;}
            case "Thursday" -> {return 4;}
            case "Friday" -> {return 5;}
            case "Saturday" -> {return 6;}
            case "Sunday" -> {return 7;}
            default -> {return -1;}
        }
    }
}