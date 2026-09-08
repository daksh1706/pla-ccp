import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the price of one shovel (k) and the special coin denomination (r)
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        
        // Loop to find the minimum number of shovels
        for (int n = 1; n <= 10; n++) {
            int totalCost = n * k;
            
            // Check if the total cost can be paid exactly
            if (totalCost % 10 == 0 || totalCost % 10 == r) {
                System.out.println(n);
                break;
            }
        }
        
        scanner.close();
    }
}
