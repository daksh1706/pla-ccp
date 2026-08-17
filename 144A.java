import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        int min = a[0];
        int min_index = 0;
        int max = a[0];
        int max_index = 0;
        
        for (int i = 0; i < n; i++) {
            if (min >= a[i]) {
                min = a[i];
                min_index = i;
            }
            if (max < a[i]) {
                max = a[i];
                max_index = i;
            }
        }
        
        if (min_index < max_index) {
            min_index = (n - 1) - min_index;
            System.out.println(min_index + max_index - 1);
        } else {
            min_index = (n - 1) - min_index;
            System.out.println(min_index + max_index);
        }
        
        scanner.close();
    }
}
