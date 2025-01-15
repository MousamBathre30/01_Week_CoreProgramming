import java.util.Scanner;

public class WordSplitter {

    // Method to split text into words using charAt() without using split() or StringBuilder
    public static String[] splitTextIntoWords(String text) {
        // Find words manually
        String[] words = new String[100]; // Assume max 100 words for simplicity
        int wordIndex = 0;
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (currentChar == ' ') {
                if (!currentWord.isEmpty()) {
                    words[wordIndex++] = currentWord; // Add word to the array
                    currentWord = ""; // Reset current word
                }
            } else {
                currentWord += currentChar; // Build the current word
            }
        }

        // Add the last word, if any
        if (!currentWord.isEmpty()) {
            words[wordIndex++] = currentWord;
        }

        // Resize the array to actual word count
        String[] result = new String[wordIndex];
        System.arraycopy(words, 0, result, 0, wordIndex);

        return result;
    }

    // Method to find the length of a string without using length()
    public static int findStringLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to generate a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store the word
            result[i][1] = String.valueOf(findStringLength(words[i])); // Store the length as String
        }

        return result;
    }

    // Method to display words and their lengths in a tabular format
    public static void displayResult(String[][] wordsWithLengths) {
        System.out.printf("%-15s%-10s%n", "Word", "Length");
        System.out.println("------------------------------");

        for (String[] row : wordsWithLengths) {
            System.out.printf("%-15s%-10d%n", row[0], Integer.parseInt(row[1]));
        }
    }

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();

        // Split text into words
        String[] words = splitTextIntoWords(inputText);

        // Get the words with their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the result
        displayResult(wordsWithLengths);

        scanner.close();
    }
}
