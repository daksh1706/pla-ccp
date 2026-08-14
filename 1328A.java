import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DivisibilityProblem {
    public static void main(String[] args) throws IOException {
        // Fast I/O for performance efficiency
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            // Check if 'a' is already divisible by 'b'
            if (a % b == 0) {
                sb.append(0).append("\n");
            } else {
                // Number of moves to make 'a' divisible by 'b'
                sb.append(b - (a % b)).append("\n");
            }
        }
        
        // Print all outputs at once
        System.out.print(sb);
    }
}
