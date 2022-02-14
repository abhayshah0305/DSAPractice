package tests;

import java.util.Arrays;
import java.util.Scanner;

public class swapArrayTest {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = key.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = key.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        swapArr(arr, 1 , 4);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
    static void swapArr(int arr[], int index1, int index2){
        int temp = 0;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
