import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int currentCapacity = 0;
        int maxCapacity = 0;
        
        while (n-- > 0) {
            int a = scanner.nextInt(); // Passengers exiting
            int b = scanner.nextInt(); // Passengers entering
            
            currentCapacity -= a;
            currentCapacity += b;
            
            if (currentCapacity > maxCapacity) {
                maxCapacity = currentCapacity;
            }
        }
        
        System.out.println(maxCapacity);
        scanner.close();
    }
}
