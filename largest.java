import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers in any order");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max= a;
        if (b>max) {
            max=b;
        }
        if (c>max) {
            max=c;
        }
        System.out.print("largest number is :");
        System.out.println(max);

    }
    
}
