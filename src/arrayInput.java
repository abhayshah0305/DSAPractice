import java.util.Arrays;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = key.nextInt();
        }
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
