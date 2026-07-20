import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.next();
        String t = scanner.next();
        
        // Reverse string t using StringBuilder
        String reversedT = new StringBuilder(t).reverse().toString();
        
        if (s.equals(reversedT)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
