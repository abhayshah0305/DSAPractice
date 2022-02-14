import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        for (int i = 1; i <= n; ++i){
            if (n % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++){
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }
}

