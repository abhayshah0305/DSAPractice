import java.util.Scanner;

public class fiboTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        int a = 0;
        int b = 1;
        int c = a + b;
        for(int i = 2; i < n; i++){
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(c);
    }
}
