package tests;

import java.util.Scanner;

public class revNumTest {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        int x = key.nextInt();
        int ans =  0;
        while(x != 0){
            int rem = x % 10;
            x = x / 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
