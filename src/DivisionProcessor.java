public class DivisionProcessor {

    // Method to perform division
    public static double performDivision(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        return (double) numerator / denominator;
    }

    // Method to call performDivision and rethrow exception with additional context
    public static double calculate(int numerator, int denominator) {
        try {
            return performDivision(numerator, denominator);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error in calculate method: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            // Example usage
            int numerator = 10;
            int denominator = 0; // This will cause an exception
            double result = calculate(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the rethrown exception and provide a meaningful error message
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
