import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int ans = 0;
        while (n>0) {
            int rem = n % 10;
            ans = (ans*10) + rem;
            n = n / 10;
        } 
        System.out.println("reverse of the number is : "+num);
    }
}
