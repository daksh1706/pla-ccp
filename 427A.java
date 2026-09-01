import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int input, policeCount = 0, untreatedCrimes = 0;
        
        for (int i = 0; i < testCases; i++) {
            input = scan.nextInt();
            if (input > 0) {
                policeCount += input;
            } else {
                if (policeCount > 0) {
                    policeCount--;
                } else {
                    untreatedCrimes++;
                }
            }
        }
        System.out.println(untreatedCrimes);
    }
}
