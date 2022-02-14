package tests;

import java.util.Arrays;
import java.util.Scanner;

public class maxValueArrayTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = key.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = key.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("The Maximum Value is: " + max(arr));
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
