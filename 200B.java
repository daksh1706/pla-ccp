import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[110];
        
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        
        double ans = sum / n;
        
        System.out.printf("%.12f\n", ans);
        
        sc.close();
    }
}
