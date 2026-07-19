import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        if (cin.hasNextInt()) {
            int n = cin.nextInt();
            int solved = 0;
            while (n-- > 0) {
                int a = cin.nextInt();
                int b = cin.nextInt();
                int c = cin.nextInt();
                
                // If at least two friends know the solution
                if (a + b + c >= 2) {
                    solved++;
                }
            }
            System.out.println(solved);
        }  
        cin.close();
    }
}
