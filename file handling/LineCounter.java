import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";
        int lineCount = countLines(filePath);
        System.out.println("Number of lines in the file: " + lineCount);
    }

    public static int countLines(String filePath) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
