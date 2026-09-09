import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            String s = scanner.next();
            int sumFirst = (s.charAt(0) - '0') + (s.charAt(1) - '0') + (s.charAt(2) - '0');
            int sumSecond = (s.charAt(3) - '0') + (s.charAt(4) - '0') + (s.charAt(5) - '0');
            
            if (sumFirst == sumSecond) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
