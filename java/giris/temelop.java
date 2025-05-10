public class temelop {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 20;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        // Bitwise Operators
        int p = 5, q = 3; // 5 = 0101, 3 = 0011 in binary
        System.out.println("p & q: " + (p & q));   // Bitwise AND
        System.out.println("p | q: " + (p | q));   // Bitwise OR
        System.out.println("p ^ q: " + (p ^ q));   // Bitwise XOR
    }    
}
