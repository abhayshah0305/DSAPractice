//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindNumbersWithEvenDigits {
    public static void main(String[] args) {
        int[] arr = {11, 12, 34, 789, 43, 2, 123};
        System.out.println(findNumbers(arr));
        System.out.println(digits2(123456));
    }
    static int findNumbers(int nums[]){
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numOfDigits = digits2(num);
        if(numOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
//    static int digits(int num){
//        if(num < 0){
//            num = num * -1;
//        }
//        int count = 0;
//        while(num > 0){
//            count++;
//            num = num / 10;
//        }
//        return count;
//    }
}
