import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            long n = scanner.nextLong();
            
            // Calculate the total combinations using formula: (n - 1) / 2
            long answer = (n - 1) / 2;
            
            System.out.println(answer);
        }
        
        scanner.close();
    }
}
