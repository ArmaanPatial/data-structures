import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter the operator (=,-,*,/) : ");
            char op = sc.next().trim().charAt(0);
            System.out.println("enter the two numbers : ");
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == 'x' || op == 'X') {
                    break;
                }
                else{
                    System.out.println("Invalid operation");
                }
                System.out.println(ans);
            }
        }
    }
    
}
