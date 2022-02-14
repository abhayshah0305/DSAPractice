package tests;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Size of th3e Array: ");
        int size = key.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = key.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the target element: ");
        int target = key.nextInt();
        System.out.print("The Element is at Index: " + BinarySearch(arr, target));

    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
