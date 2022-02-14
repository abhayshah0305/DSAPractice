import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = key.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = key.nextInt();
        }
        revArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void revArr(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
