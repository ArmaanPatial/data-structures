import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();
        
        switch (empID) {
            case 1 ->System.out.println("Armaan Patial");
            case 2 ->System.out.println("Ayush Patial");
            case 3 -> {
                System.out.println("Employee no. 3");
                switch (department) {
                    case "it"->System.out.println("IT Department");
                    case "management" ->System.out.println("Management department");
                    default ->System.out.println("No department");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}
