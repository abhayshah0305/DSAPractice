import java.util.Scanner;

public class revString {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String str = key.next();
        String newString = "";
        char ch;
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            newString = ch + newString;
        }
        System.out.println(newString);
    }
}
