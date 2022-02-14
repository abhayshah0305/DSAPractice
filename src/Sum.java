import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        int total = num1 + num2;
        System.out.println(total);
    }
}
