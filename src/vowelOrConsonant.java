import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        char ch = key.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
