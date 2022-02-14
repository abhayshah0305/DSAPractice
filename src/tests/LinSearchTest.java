package tests;

import java.util.Arrays;

public class LinSearchTest {
    public static void main(String[] args) {
        int[] arr = {1 ,2 , 33 , 15, 66, 7 ,5};
        System.out.println(Arrays.toString(arr));
        System.out.println("The Element is at index: " + linSearch(arr, 5));
    }
    static int linSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
