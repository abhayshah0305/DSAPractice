import java.util.Arrays;
import java.util.Scanner;

public class orderAgnostic {
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
        int target = 9;
        int ans = orderagnos(arr, target);
        System.out.println(ans);
    }
    static int orderagnos(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc) {
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
            } else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
