import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fast I/O alternative for Java
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextLong()) {
            long n = sc.nextLong();
            
            // (n & 1) == 1 checks if the number is odd
            if ((n & 1) == 1) {
                System.out.println(-(n / 2 + 1));
            } else {
                System.out.println(n / 2);
            }
        }
        sc.close();
    }
}
