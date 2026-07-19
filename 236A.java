import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        if (cin.hasNext()) {
            String s = cin.next();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            int l = chars.length;
            int ans = 0;
            for (int i = 1; i < l; i++) {
                if (chars[i] != chars[i - 1]) {
                    ans++;
                }
            }
            if ((ans & 1) == 1) {
                System.out.println("CHAT WITH HER!");
            } else {
                System.out.println("IGNORE HIM!");
            }
        }
        cin.close();
    }
}
