import java.util.Arrays;
import java.util.Scanner;

public class swapArray {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = key.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = key.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        swap(arr, 1,3);
        System.out.println();
        System.out.print(Arrays.toString(arr));
    }
    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
