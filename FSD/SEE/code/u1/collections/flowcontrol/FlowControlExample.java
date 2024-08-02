package collections.flowcontrol;

public class FlowControlExample {

    public static void main(String[] args) {
        // 1. Conditional Statements
        int number = 10;

        // if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // if-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        // if-else if-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 2. Looping Statements

        // for loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Enhanced for loop (for-each loop)
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // while loop
        System.out.println("While loop:");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        // do-while loop
        System.out.println("Do-while loop:");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);

        // 3. Branching Statements

        // break statement
        System.out.println("Break statement:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // continue statement
        System.out.println("Continue statement:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // return statement
        int result = square(5);
        System.out.println("Square of 5 is: " + result);
    }

    // Method to demonstrate return statement
    public static int square(int number) {
        return number * number;
    }
}
