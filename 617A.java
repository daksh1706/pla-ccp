import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        // Equivalent to (x + 4) / 5
        int ans = (x + 4) / 5;
        
        System.out.println(ans);
        
        scanner.close();
    }
}
