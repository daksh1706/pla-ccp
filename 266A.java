import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();

        // Reading the characters as a string or character array
        String input = scanner.next();
        char[] array = input.toCharArray();

        if (n <= 50) {
            int R = 0, B = 0, G = 0;

            // Stop at n - 1 to avoid an ArrayIndexOutOfBoundsException when checking i + 1
            for (int i = 0; i < n - 1; i++) {
                if (array[i] == array[i + 1]) {
                    if (array[i] == 'R') {
                        R++;
                    } else if (array[i] == 'B') {
                        B++;
                    } else if (array[i] == 'G') {
                        G++;
                    }
                }
            }

            int sum = R + G + B;
            System.out.println(sum);
        }

        scanner.close();
    }
}
