import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        
        if (a > b) {
            c = 0;
        } else {
            while (a <= b) {
                a = a * 3;
                b = b * 2;
                c++;
            }
        }
        
        System.out.println(c);
        scanner.close();
    }
}
