import java.util.Scanner;

public class WordLength {

    // Method to split the text into words without using the split() method
    public static String[] splitTextIntoWords(String text) {
        // Convert the text to a character array
        char[] charArray = text.toCharArray();
        StringBuilder currentWord = new StringBuilder();
        StringBuilder words = new StringBuilder();
        
        // Loop through each character and form words
        for (char c : charArray) {
            if (Character.isWhitespace(c)) {
                if (currentWord.length() > 0) {
                    words.append(currentWord).append(" "); // Append the word to words list
                    currentWord.setLength(0); // Reset the current word
                }
            } else {
                currentWord.append(c); // Add character to current word
            }
        }
        
        // Append the last word if it exists
        if (currentWord.length() > 0) {
            words.append(currentWord);
        }

        // Split the words based on spaces
        return words.toString().split(" ");
    }

    // Method to calculate the length of a word without using length()
    public static String findWordLength(String word) {
        int length = 0;
        for (int i = 0; i < word.length(); i++) {
            length++;
        }
        return String.valueOf(length);
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordAndLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store the word
            result[i][1] = findWordLength(words[i]); // Store the length of the word
        }
        
        return result;
    }

    // Method to display the words and their lengths in a tabular format
    public static void displayResult(String[][] result) {
        System.out.printf("%-15s%-10s%n", "Word", "Length");
        System.out.println("------------------------------");
        
        // Display each word and its corresponding length
        for (String[] row : result) {
            System.out.printf("%-15s%-10d%n", row[0], Integer.parseInt(row[1])); // Convert length to int and display
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to input a string
        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();
        
        // Split the text into words
        String[] words = splitTextIntoWords(inputText);
        
        // Get the word and length 2D array
        String[][] wordLengthArray = getWordAndLengthArray(words);
        
        // Display the result
        displayResult(wordLengthArray);
        
        scanner.close();
    }
}
