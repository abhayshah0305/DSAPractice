package tests;

import java.util.Scanner;

public class LinSearchTest1 {
    public static void main(String[] args) {
        int[] arr = {22, 31, 6, 32, 1, 56, 7, 9};
        int target = 31;
        System.out.println(linSearch(arr, target));
    }
    static int linSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index  = 0; index < arr.length; index++){
            if(arr[index] == target){
                return arr[index] + index;
            }
        }
        return -1;
    }
}
