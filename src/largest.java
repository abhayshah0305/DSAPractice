import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int a = key.nextInt();
        int b = key.nextInt();
        int c = key.nextInt();

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);
    }
}
