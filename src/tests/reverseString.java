package tests;

import java.util.Scanner;

public class reverseString {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        String str = key.next();
        char ch;
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            newStr = ch + newStr;
        }
        System.out.println(newStr);
    }
}
