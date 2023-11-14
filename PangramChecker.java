//  C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabets from a-z)

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = checkIfPangram(input.toLowerCase()); // Convert input to lowercase for case insensitivity

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] alphabetOccurrence = new boolean[26];

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabetOccurrence[c - 'a'] = true;
            }
        }

        for (boolean occurred : alphabetOccurrence) {
            if (!occurred) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters from 'a' to 'z' occurred in the sentence
    }
}
