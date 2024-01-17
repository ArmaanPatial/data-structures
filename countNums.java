import java.util.Scanner;

public class countNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        System.out.print("enter the digit whose count is needed : ");
        int num = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem==num) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
    
}
