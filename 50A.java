import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        int a = cin.nextInt();
        int b = cin.nextInt();
        int sum = (a * b) / 2;
        
        System.out.println(sum);
        
        cin.close();
    }
}
