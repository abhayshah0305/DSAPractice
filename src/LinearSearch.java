import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = key.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = key.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("The Element is at Index: " + linSearch(arr, 5));
    }

    static int linSearch(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
