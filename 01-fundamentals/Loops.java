class Loops {
    public static void main(String[] args) {
        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop iteration: " + i);
        }

        // While loop
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop iteration: " + j);
            j++;
        }

        // Do-while loop
        int k = 1;
        do {
            System.out.println("Do-While loop iteration: " + k);
            k++;
        } while (k <= 5);

        // Enhanced for loop (for-each loop)
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int num : numbers) {
            System.out.println("Enhanced For loop iteration: " + num);
        }
    }
}