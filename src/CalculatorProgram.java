import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter the Operator: ");
            char op = key.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter the Numbers: ");
                int num1 = key.nextInt();
                int num2 = key.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }
            else if(op == 'x' || op == 'X') {
                break;
            }
            else{
                System.out.println("Invalid Operation");
            }
            System.out.println("Answer: " + ans);
        }
    }
}
