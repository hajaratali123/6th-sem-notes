public class OperatorExamples {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int num = 8;
        int negativeNum = -8;

        // Less than or equal to (<=)
        System.out.println("Example of <= operator:");
        if (a <= b) {
            System.out.println(a + " is less than or equal to " + b);
        } else {
            System.out.println(a + " is greater than " + b);
        }

        // Greater than or equal to (>=)
        System.out.println("\nExample of >= operator:");
        if (b >= a) {
            System.out.println(b + " is greater than or equal to " + a);
        } else {
            System.out.println(b + " is less than " + a);
        }

        // Right shift (>>)
        System.out.println("\nExample of >> operator:");
        int rightShiftResult = num >> 2; // binary: 1000 >> 2 = 0010
        System.out.println(num + " >> 2 = " + rightShiftResult);

        // Left shift (<<)
        System.out.println("\nExample of << operator:");
        int leftShiftResult = num << 2; // binary: 1000 << 2 = 100000
        System.out.println(num + " << 2 = " + leftShiftResult);

        // Unsigned right shift (>>>)
        System.out.println("\nExample of >>> operator:");
        int unsignedRightShiftResult = negativeNum >>> 2;
        System.out.println(negativeNum + " >>> 2 = " + unsignedRightShiftResult);
    }}
