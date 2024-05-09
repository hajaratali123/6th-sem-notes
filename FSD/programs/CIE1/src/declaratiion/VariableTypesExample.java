package declaratiion;

public class VariableTypesExample {
    public static void main(String[] args) {
        // Primitive data types
        byte byteVar = 127;         // 8-bit signed integer
        short shortVar = 32767;     // 16-bit signed integer
        int intVar = 2147483647;    // 32-bit signed integer
        long longVar = 9223372036854775807L;  // 64-bit signed integer
        float floatVar = 3.14f;     // 32-bit floating-point number
        double doubleVar = 3.14159; // 64-bit floating-point number
        char charVar = 'A';         // 16-bit Unicode character
        boolean booleanVar = true;  // true or false

        // Reference data types
        String stringVar = "Hello, World!"; // A sequence of characters

        // Printing the values of variables
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);
        System.out.println("stringVar: " + stringVar);
    }
}
