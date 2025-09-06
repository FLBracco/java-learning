class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10, b = 4;
        System.out.println("Addition: " + (a + b)); // 14
        System.out.println("Subtraction: " + (a - b)); // 6
        System.out.println("Multiplication: " + (a * b)); // 40
        System.out.println("Division: " + (a / b)); // 40
        System.out.println("Modulus: " + (a % b)); // 2
        System.out.println("Increment: " + (++a)); // 11
        System.out.println("Decrement: " + (--b)); // 3

        // Asignment Operators
        int c = 100;
        System.out.println("c = " + c); // 100
        c += 5;
        System.out.println("Plus equals = " + c); // 105
        c -= 5;
        System.out.println("Minus equals = " + c); // 105
        c *= 2;
        System.out.println("Times equals = " + c); // 200
        c /= 2;
        System.out.println("Divided equals = " + c); // 100
        c %= 3;
        System.out.println("Modulus equals = " + c); // 1

        // Comparison Operators
        int x = 10;
        System.out.println("Equals: " + (x == 10)); // true
        System.out.println("Not equals: " + (x != 10)); // false
        System.out.println("Greater than: " + (x > 3)); // true
        System.out.println("Greater than or equal: " + (x >= 5)); // false
        System.out.println("Less than: " + (x < 5)); // false
        System.out.println("Less than or equal: " + (x <= 5)); // false

        // Logical Operators
        int y = 10;
        System.out.println("and operator: " + (y > 5 && y < 20)); // true
        System.out.println("or operator: " + (y > 5 || y >= 20)); // true
        System.out.println("not operator: " + !(y > 5 || y >= 20)); // true

        // Bitwise Operators
        int p = 5; // 0101 in binary
        System.out.println("Bitwise AND: " + (p & 3)); // 1 (0001 in binary)
        System.out.println("Bitwise OR: " + (p | 3)); // 7 (0111 in binary)
        System.out.println("Bitwise XOR: " + (p ^ 3)); // 6 (0110 in binary)
        System.out.println("Bitwise NOT: " + (~p)); // -6 (inverts all bits)
        System.out.println("Left Shift: " + (p << 1)); // 10 (1010 in binary)
        System.out.println("Right Shift: " + (p >> 1)); // 2 (0010 in binary)
    }
}