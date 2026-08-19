import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long totalBills = 0;
        
        long[] denominations = {100, 20, 10, 5, 1};
        
        for (long bill : denominations) {
            totalBills += n / bill;
            n %= bill;
        }
        
        System.out.println(totalBills);
    }
}
