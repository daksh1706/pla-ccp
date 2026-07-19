import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        int n = cin.nextInt();
        int a = cin.nextInt();
        int r, i;
        
        for (i = 1; i <= a; i++) {
            r = n % 10;
            if (r == 0) {
                n /= 10;
            } else {
                n -= 1;
            }
        }
        
        System.out.println(n);
        
        cin.close();
    }
}
