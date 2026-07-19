import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        if (cin.hasNextInt()) {
            int n = cin.nextInt();
            while (n-- > 0) {
                String s = cin.next();
                if (s.length() > 10) {
                    System.out.println("" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1));
                } else {
                    System.out.println(s);
                }
            }
        }
        
        cin.close();
    }
}
