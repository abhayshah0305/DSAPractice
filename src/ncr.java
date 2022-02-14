import java.util.Scanner;

public class ncr {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = key.nextInt();
        System.out.print("Input r: ");
        int r = key.nextInt();
        int result = (fact(n))/(fact(r)*fact(n-r));
        System.out.println("nCr result: " + result);
    }
    static int fact(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
