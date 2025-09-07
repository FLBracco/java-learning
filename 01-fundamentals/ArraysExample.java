public class ArraysExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Access and print the first element of the array
        System.out.println("First element: " + numbers[0]);

        // Modify the second element of the array
        numbers[1] = 22;

        // Print all elements of the array using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Print all elements of the array using an enhanced for loop
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }

        // Print the length of the array
        System.out.println("Array length: " + numbers.length);
    }
}