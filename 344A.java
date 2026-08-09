import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] mag = new String[n];

        for (int i = 0; i < n; i++) {
            mag[i] = sc.next();
        }

        int gp = 0;
        for (int i = 0; i < n; i++) {
            // Check boundary to prevent IndexOutOfBoundsException
            if (i == n - 1 || !mag[i].equals(mag[i + 1])) {
                gp++;
            }
        }

        System.out.println(gp);
        sc.close();
    }
}
