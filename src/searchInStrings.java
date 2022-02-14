import java.sql.SQLOutput;
import java.util.Scanner;

public class searchInStrings {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String name = key.next();
        char target = key.next().charAt(0);
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
