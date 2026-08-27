import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Read the number of teams
        int n = in.nextInt();
        
        int[] home = new int[n];
        int[] guest = new int[n];
        
        // Populate the uniform arrays
        for (int i = 0; i < n; i++) {
            home[i] = in.nextInt();
            guest[i] = in.nextInt();
        }
        
        int conflictCount = 0;
        
        // Compare every host team's home uniform with every guest team's guest uniform
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // A team cannot play against itself
                if (i != j) {
                    if (home[i] == guest[j]) {
                        conflictCount++;
                    }
                }
            }
        }
        
        // Print the final result
        System.out.println(conflictCount);
        
        in.close();
    }
}
