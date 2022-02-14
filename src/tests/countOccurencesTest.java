package tests;

import java.util.Scanner;

public class countOccurencesTest {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == 3) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
