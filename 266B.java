import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] s = sc.next().toCharArray();
        
        while (t-- > 0) {
            for (int i = 1; i < n; ++i) {
                if (s[i] == 'G' && s[i - 1] == 'B') {
                    s[i] = 'B';
                    s[i - 1] = 'G';
                    ++i; // Skip the next index to avoid moving the same boy twice in 1 second
                }
            }
        }
        
        System.out.println(new String(s));
        sc.close();
    }
}
