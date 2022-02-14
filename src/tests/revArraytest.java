package tests;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class revArraytest {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Size of th3e Array: ");
        int size = key.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = key.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        revArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void revArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int temp = 0;
        while(start <= end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
