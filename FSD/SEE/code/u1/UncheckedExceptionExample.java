public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    // Method that causes an unchecked exception
    public static void divide(int a, int b) {
        int result = a / b; // This will throw ArithmeticException
        System.out.println("Result: " + result);
    }
}
