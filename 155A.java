import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int first = sc.nextInt();
        int min = first;
        int max = first;
        int amazingCount = 0;
        
        for (int i = 1; i < n; i++) {
            int score = sc.nextInt();
            if (score > max) {
                max = score;
                amazingCount++;
            } else if (score < min) {
                min = score;
                amazingCount++;
            }
        }
        
        System.out.println(amazingCount);
        sc.close();
    }
}
