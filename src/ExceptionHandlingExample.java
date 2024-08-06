import java.io.IOException;

public class ExceptionHandlingExample {

    // Method that processes data and throws both checked and unchecked exceptions
    public static void processData(int value) throws IOException {
        if (value < 0) {
            throw new IOException("Negative value provided"); // Checked exception
        }
        if (value == 0) {
            throw new IllegalArgumentException("Value cannot be zero"); // Unchecked exception
        }
        System.out.println("Processing value: " + value);
    }

    public static void main(String[] args) {
        try {
            // Example usage
            processData(-1); // This will cause an IOException
        } catch (IOException e) {
            // Handle checked exception
            System.err.println("Caught IOException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle unchecked exception
            System.err.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        try {
            // Example usage
            processData(0); // This will cause an IllegalArgumentException
        } catch (IOException e) {
            // Handle checked exception
            System.err.println("Caught IOException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle unchecked exception
            System.err.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        try {
            // Example usage
            processData(10); // This will process successfully
        } catch (IOException | IllegalArgumentException e) {
            // Handle both types of exceptions
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}
