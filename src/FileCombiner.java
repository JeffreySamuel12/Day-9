import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCombiner {

    public static void combineFiles(String inputFile1, String inputFile2, String outputFile) {
        try (
                BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
                BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            // Read from the first file and write to the output file
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Read from the second file and write to the output file
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            // Handle the exception
            System.err.println("An error occurred while processing the files: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFile1 = "C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 9\\src\\input1.txt";
        String inputFile2 = "C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 9\\src\\input2.txt";
        String outputFile = "C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 9\\src\\output.txt";

        combineFiles(inputFile1, inputFile2, outputFile);
        System.out.println("Files combined successfully!");
    }
}
