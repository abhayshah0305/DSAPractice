import java.util.Arrays;
import java.util.Scanner;

public class revArrayTest {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = key.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = key.nextInt();
        }
        revArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    // 1 2 3 4 5 -> 5 2 3 4 1 -> 5 4 3 2 1
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void revArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
