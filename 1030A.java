import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            sum += x;
        }

        if (sum > 0) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }

        scanner.close();
    }
}
