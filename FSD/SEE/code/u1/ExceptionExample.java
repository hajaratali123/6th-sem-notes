import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) {
        // Unchecked exception example (ArithmeticException)
        try {
            int result = divide(10, 0); // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }

        // Unchecked exception example (NullPointerException)
        try {
            String s = null;
            printLength(s); // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }

        // Checked exception example (IOException)
        try {
            readFile("nonexistentfile.txt"); // This will cause IOException
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }

        // Unchecked exception example (ArrayIndexOutOfBoundsException)
        try {
            int[] array = new int[5];
            array[10] = 50; // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Unchecked exception example (NumberFormatException)
        try {
            String number = "abc";
            int parsedNumber = Integer.parseInt(number); // This will cause NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        }
    }

    // Method that may throw an ArithmeticException (unchecked exception)
    public static int divide(int a, int b) {
        return a / b;
    }

    // Method that may throw a NullPointerException (unchecked exception)
    public static void printLength(String s) {
        System.out.println(s.length());
    }

    // Method that may throw an IOException (checked exception)
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
