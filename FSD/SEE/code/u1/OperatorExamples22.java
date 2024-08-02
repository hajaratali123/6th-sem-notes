public class OperatorExamples22 {
    public static void main(String[] args) {
        // ------------------------------
        // Arithmetic Operators
        // ------------------------------
        int a = 10, b = 20;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b): " + (a + b)); // Addition
        System.out.println("Subtraction (a - b): " + (a - b)); // Subtraction
        System.out.println("Multiplication (a * b): " + (a * b)); // Multiplication
        System.out.println("Division (b / a): " + (b / a)); // Division
        System.out.println("Modulus (b % a): " + (b % a)); // Modulus

        // ------------------------------
        // Unary Operators
        // ------------------------------
        int x = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("Initial value of x: " + x); // 10
        System.out.println("Unary plus (++x): " + ++x); // Unary plus and increment
        System.out.println("Post-increment (x++): " + x++); // Post-increment
        System.out.println("Value of x after x++: " + x); // Value after post-increment
        System.out.println("Unary minus (--x): " + --x); // Unary minus and decrement
        System.out.println("Post-decrement (x--): " + x--); // Post-decrement
        System.out.println("Value of x after x--: " + x); // Value after post-decrement

        // ------------------------------
        // Assignment Operators
        // ------------------------------
        int y = 10;
        System.out.println("\nAssignment Operators:");
        y += 5; // y = y + 5
        System.out.println("Add and assign (y += 5): " + y); // 15
        y -= 3; // y = y - 3
        System.out.println("Subtract and assign (y -= 3): " + y); // 12
        y *= 2; // y = y * 2
        System.out.println("Multiply and assign (y *= 2): " + y); // 24
        y /= 4; // y = y / 4
        System.out.println("Divide and assign (y /= 4): " + y); // 6
        y %= 3; // y = y % 3
        System.out.println("Modulus and assign (y %= 3): " + y); // 0

        // ------------------------------
        // Relational Operators
        // ------------------------------
        System.out.println("\nRelational Operators:");
        System.out.println("Equal to (a == b): " + (a == b)); // false
        System.out.println("Not equal to (a != b): " + (a != b)); // true
        System.out.println("Greater than (a > b): " + (a > b)); // false
        System.out.println("Less than (a < b): " + (a < b)); // true
        System.out.println("Greater than or equal to (a >= b): " + (a >= b)); // false
        System.out.println("Less than or equal to (a <= b): " + (a <= b)); // true

        // ------------------------------
        // Logical Operators
        // ------------------------------
        boolean c = true, d = false;
        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND (c && d): " + (c && d)); // false
        System.out.println("Logical OR (c || d): " + (c || d)); // true
        System.out.println("Logical NOT (!c): " + !c); // false

        // ------------------------------
        // Bitwise Operators
        // ------------------------------
        int e = 5, f = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND (e & f): " + (e & f)); // 1 (0101 & 0011 = 0001)
        System.out.println("Bitwise OR (e | f): " + (e | f)); // 7 (0101 | 0011 = 0111)
        System.out.println("Bitwise XOR (e ^ f): " + (e ^ f)); // 6 (0101 ^ 0011 = 0110)
        System.out.println("Bitwise complement (~e): " + ~e); // -6 (bitwise complement of 5)
        System.out.println("Left shift (e << 1): " + (e << 1)); // 10 (0101 << 1 = 1010)
        System.out.println("Right shift (e >> 1): " + (e >> 1)); // 2 (0101 >> 1 = 0010)

        // ------------------------------
        // Ternary Operator
        // ------------------------------
        int g = 10, h = 20;
        System.out.println("\nTernary Operator:");
        int max = (g > h) ? g : h;
        System.out.println("Ternary (max = (g > h) ? g : h): " + max); // 20

        // ------------------------------
        // instanceof Operator
        // ------------------------------
        String str = "Hello";
        System.out.println("\ninstanceof Operator:");
        boolean result = str instanceof String;
        System.out.println("instanceof (str instanceof String): " + result); // true
    }
}
