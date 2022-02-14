import java.util.Arrays;

public class searchIn2DArrays {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2 ,3, 4},
                {4, 5, 6, 7, 8},
                {7, 8, 9},
                {2, 12}
        };
        int target = 9;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[j].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int searchMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int j = 0; j < arr[j].length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
}
