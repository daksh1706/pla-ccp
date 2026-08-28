import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read the guest's name, host's name, and the pile of letters
        String guest = scan.nextLine();
        String host = scan.nextLine();
        String pile = scan.nextLine();
        
        // Combine the guest and host names
        String combinedNames = guest + host;
        
        // Convert strings to character arrays
        char[] nameChars = combinedNames.toCharArray();
        char[] pileChars = pile.toCharArray();
        
        // Sort both character arrays
        Arrays.sort(nameChars);
        Arrays.sort(pileChars);
        
        // Compare the sorted arrays
        if (Arrays.equals(nameChars, pileChars)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

