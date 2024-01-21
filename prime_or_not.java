public class prime_or_not {
    public static void main(String[] args) {
        IsPrime(21);
    }
    static void IsPrime(int n){
        if (n <= 3) {
            System.out.println("Prime");;
        }
        if (n > 3) {
            if (n % 2 == 0 || n % 3 == 0) {
                System.out.println("Not Prime");
            }
            else{
                System.out.println("Prime");
            }
        }
    }
}
