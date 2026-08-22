import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the total number of polyhedrons
        int n = scanner.nextInt();
        int totalFaces = 0;
        
        // Loop through each polyhedron name
        for (int i = 0; i < n; i++) {
            String polyhedron = scanner.next();
            
            // Match the string and add the corresponding face count
            switch (polyhedron) {
                case "Tetrahedron":
                    totalFaces += 4;
                    break;
                case "Cube":
                    totalFaces += 6;
                    break;
                case "Octahedron":
                    totalFaces += 8;
                    break;
                case "Dodecahedron":
                    totalFaces += 12;
                    break;
                case "Icosahedron":
                    totalFaces += 20;
                    break;
            }
        }
        
        // Print the final result
        System.out.println(totalFaces);
        
        scanner.close();
    }
}
