import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
