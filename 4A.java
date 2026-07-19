import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // Read the weight of the watermelon
        int w = scanner.nextInt();
        // Check if the weight is even and strictly greater than 2
        if (w % 2 == 0 && w > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
