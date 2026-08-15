import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<n-1; i++){
            result.append(i%2==0?"I hate that ":"I love that ");
        }
        
        result.append(n%2==0?"I love it":"I hate it");
        
        System.out.println(result.toString());
    }
}
