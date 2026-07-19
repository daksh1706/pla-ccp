import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        if (cin.hasNext()) {
            String x = cin.next();
            int lenX = x.length();
            int upcase = 0;
            int lowcase = 0;
            for (int i = 0; i < lenX; i++) {
                char ch = x.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    lowcase++;
                } else {
                    upcase++;
                }
            }
            int findA = lenX - lowcase;
            int finda = lenX - upcase;
            if ((findA == finda) || (finda >= findA)) {
                x = x.toLowerCase();
            } else {
                x = x.toUpperCase();
            }
            System.out.println(x);
        }
        cin.close();
    }
}
