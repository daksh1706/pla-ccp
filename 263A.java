import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] array = new int[6][6];
        int result = 0;
        int row = 0;
        int column = 0;
        
        // Reading the 5x5 matrix
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        // Processing the matrix
        for(int i = 0; i < 5; i++){
            row++;
            for(int j = 0; j < 5; j++){
                column++;
                if(array[i][j] == 1){
                    result = Math.abs(row - 3) + Math.abs(column - 3);
                }
                if(column == 5){
                    column = 0;
                }
            }
        }
        
        System.out.println(result);
        
        scanner.close();
    }
}
