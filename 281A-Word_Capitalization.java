import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Fast I/O using BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();

        if (word != null && !word.isEmpty()) {
            // Capitalize the first character and attach the rest of the string
            String result = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            System.out.println(result);
        }
    }
}
