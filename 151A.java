import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();
        
        // Total milliliters of the drink
        int totalDrink = k * l;
        int toastsFromDrink = totalDrink / nl;
        
        // Total lime slices
        int toastsFromLimes = c * d;
        
        // Total grams of salt
        int toastsFromSalt = p / np;
        
        // Find the minimum toasts possible from all ingredients, then divide by friends (n)
        int minToasts = Math.min(Math.min(toastsFromDrink, toastsFromLimes), toastsFromSalt);
        int result = minToasts / n;
        
        System.out.println(result);
        
        scanner.close();
    }
}

