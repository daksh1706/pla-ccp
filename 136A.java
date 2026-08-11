import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] f = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            f[p] = i;
        }
        
        System.out.print(f[1]);
        for (int i = 2; i <= n; i++) {
            System.out.print(" " + f[i]);
        }
        System.out.println();
        
        sc.close();
    }
}
