import java.util.Scanner;
import java.util.Arrays;

public class MeetingFriends {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read the three coordinates
        int[] x = new int[3];
        x[0] = scan.nextInt();
        x[1] = scan.nextInt();
        x[2] = scan.nextInt();
        
        // Sort the coordinates to easily find min and max
        Arrays.sort(x);
        
        // The minimum total distance is the max value minus the min value
        int minDistance = x[2] - x[0];
        
        System.out.println(minDistance);
        
        scan.close();
    }
}
