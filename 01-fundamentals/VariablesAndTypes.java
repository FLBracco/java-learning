import java.util.Scanner;

class VariablesAndTypes { // Class declaration
    public static void main(String[] args) { // main method
        // Variable declaration and initialization
        int age = 24; // Integer variable
        String name = "Fabricio"; // String variable
        double score = 93.5; // Double variable
        char grade = 'A'; // Character variable
        boolean isPassed = true; // Boolean variable

        // Primitive data types:
        byte b = 100; // 1 byte
        short s = 10000; // 2 bytes
        int i = 100000; // 4 bytes
        long l = 100000L; // 8 bytes
        float f = 10.5f; // 4 bytes
        double d = 20.99; // 8 bytes
        char c = 'F'; // 2 bytes
        boolean bool = false; // 1 bit

        // Non-primitive data types:
        String str = "Hello, World!"; // String object
        int[] arr = { 1, 2, 3, 4, 5 }; // Array object
        class Person {
            String name;
        } // Class object
        Person p = new Person(); // Object of Person class
        interface Drawable {
            void draw();
        }

        // User input data types:
        // Here we would tipically use Scanner or BufferedReader for user input,
        // scanner have nextInt(), nextLine(), next(), nextDouble(), etc.
        // BufferedReader have readLine() and we need to parse the input to the desired
        // type.
        Scanner scanner = new Scanner(System.in);
        // Take a string input
        System.out.print("Enter your name: ");
        String name1 = scanner.nextLine();
        // Take an integer input
        System.out.print("Enter your age: ");
        int age1 = scanner.nextInt();

        System.out.println("Hello, " + name1 + ". You are " + age1 + " years old.");
        scanner.close(); // Close the scanner
    }
}