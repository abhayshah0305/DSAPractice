import java.util.Scanner;

public class numPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int original = n;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            ans = ans * 10 + rem;
        }
        if(ans == original) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
