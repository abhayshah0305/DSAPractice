package tests;

import java.util.Scanner;

public class armstrongTest1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = key.nextInt();
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}
