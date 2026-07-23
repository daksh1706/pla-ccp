import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        while (true) {
            y += 1;
            
            // Extract each digit (for a 4-digit year)
            int a = y / 1000;
            int b = (y / 100) % 10;
            int c = (y / 10) % 10;
            int d = y % 10;

            // Check if all four digits are distinct
            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                break;
            }
        }

        System.out.println(y);
        scanner.close();
    }
}
