import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        // Count how many numbers are in the string
        int numbersCount = (s.length() + 1) / 2;
        int[] arr = new int[numbersCount];
        
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                continue;
            } else {
                // Convert character digit to integer
                arr[count++] = s.charAt(i) - '0';
            }
        }
        
        // Sort the array in non-decreasing order
        Arrays.sort(arr);
        
        // Print the formatted expression
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
            if (i < count - 1) {
                System.out.print("+");
            }
        }
        
        sc.close();
    }
}
