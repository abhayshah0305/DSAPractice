import java.util.Scanner;

public class tempConversion {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        float c = key.nextFloat();
        float f = (c * 9/5)+32;
        System.out.println(f);
    }
}
