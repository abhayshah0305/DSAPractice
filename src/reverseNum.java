import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        int ans = 0;
//        while(n > 0){
//            int rem = n % 10;
//            n = n / 10;
//            ans = ans * 10 + rem;
//        }
        while (n > 0) {
            int rem = n % 10;
            System.out.print(rem);
            n = n / 10;
        }
        //System.out.println(ans);
    }
}

