import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileProcessor {

    public void processFiles(List<String> filePaths) {
        for (String filePath : filePaths) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Process each line of the file
                    System.out.println(line);
                }
            } catch (IOException e) {
                // Handle the exception
                System.err.println("Error reading file: " + filePath);
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        List<String> files = List.of("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 9\\src\\file1.txt", "C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 9\\src\\file2.txt","C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 9\\src\\file3.txt");
        processor.processFiles(files);
    }
}
