import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
//        String fruit = key.next();
//        switch (fruit) {
//            case "Apple" -> System.out.println("Red Fruit");
//            case "Grape" -> System.out.println("Purple Fruit");
//            case "Mango" -> System.out.println("Yellow Fruit");
//            case "Strawberry" -> System.out.println("She loves them");
//            case "Chiku" -> System.out.println("Brown Fruit");
//            default -> System.out.println("Invalid Input");
//        }
        int day = key.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Input");
        }
    }
}
