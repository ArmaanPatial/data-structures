public class ads {
    static void pattern1(int n){
        for(int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }

    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int i = 1; i < 2 * n ; i++) {
            int col = i>n ? 2*n-i:i;
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (n-i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for (int i = 0; i < 2 * n; i++) {
            int col = i >= n ? ((2*n) - i )-1 : i;
            for (int j = 1; j <= col; j++) {
                System.out.print(" ");
            }
            for (int k = col; k < n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++) {
                if (k == 1 || i == n || k == (2*i) - 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++) {
                if (k == 1 || i == n || k == (2*i)-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern14(5);
    }
    
}