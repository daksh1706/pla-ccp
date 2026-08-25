import java.util.Scanner;
import java.util.ArrayList;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> roundNumbers = new ArrayList<>();
            int multiplier = 1;
            
            // Extract digits from right to left
            while (n > 0) {
                int digit = n % 10;
                
                // If the digit is non-zero, it forms a round number
                if (digit != 0) {
                    roundNumbers.add(digit * multiplier);
                }
                
                // Move to the next digit place
                n /= 10;
                multiplier *= 10;
            }
            
            // Print the total number of round summands
            System.out.println(roundNumbers.size());
            
            // Print the round numbers separated by spaces
            for (int i = 0; i < roundNumbers.size(); i++) {
                System.out.print(roundNumbers.get(i) + (i == roundNumbers.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
        
        sc.close();
    }
}
