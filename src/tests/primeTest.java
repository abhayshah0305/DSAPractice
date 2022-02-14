package tests;

import java.util.Scanner;

public class primeTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = key.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
