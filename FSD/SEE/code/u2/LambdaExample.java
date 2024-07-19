// Functional interface with one abstract method
interface MyFunctionalInterface {
    void sayMessage(String message);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression to implement MyFunctionalInterface
        MyFunctionalInterface myLambda = (message) -> System.out.println("Hello, " + message);
        
        // Calling the lambda expression
        myLambda.sayMessage("Lambda Expression!");
    }
}
