import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        String str = key.next();
        String newString = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            newString = ch + newString;
        }
        //System.out.println(newString);
        if(newString.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
