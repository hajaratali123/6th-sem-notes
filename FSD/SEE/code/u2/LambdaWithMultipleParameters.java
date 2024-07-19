// Functional interface with multiple parameters
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaWithMultipleParameters {
    public static void main(String[] args) {
        // Lambda expression to implement MathOperation interface for addition
        MathOperation addition = (a, b) -> a + b;
        
        // Lambda expression to implement MathOperation interface for subtraction
        MathOperation subtraction = (a, b) -> a - b;
        
        // Lambda expression to implement MathOperation interface for multiplication
        MathOperation multiplication = (a, b) -> a * b;
        
        // Using the lambda expressions
        System.out.println("Addition: " + addition.operate(10, 5)); // Output: 15
        System.out.println("Subtraction: " + subtraction.operate(10, 5)); // Output: 5
        System.out.println("Multiplication: " + multiplication.operate(10, 5)); // Output: 50
    }
}
