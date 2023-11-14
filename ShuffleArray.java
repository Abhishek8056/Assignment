//  A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        shuffleArray(array);

        // Print the shuffled array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;

        // create object for random class
        Random rand = new Random();

        // Start from the last element and swap one by one
        for (int i = n - 1; i > 0; i--) {
            // Pick Random index 0 to i
            int j = rand.nextInt(i + 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
