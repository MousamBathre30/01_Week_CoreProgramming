import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters
    public static String[] findFrequency(String text) {
        // Convert the string to a character array
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];

        // Outer loop to iterate through each character
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // Ignore already counted characters
                frequency[i] = 1; // Initialize frequency to 1
                // Inner loop to check for duplicate characters
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        frequency[i]++;
                        chars[j] = '0'; // Mark duplicate characters as '0'
                    }
                }
            }
        }

        // Create an array to store characters and their frequencies
        String[] result = new String[chars.length];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " = " + frequency[i];
            }
        }

        // Trim the result array to remove null entries
        String[] trimmedResult = new String[index];
        System.arraycopy(result, 0, trimmedResult, 0, index);
        return trimmedResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call the method to find frequency
        String[] frequencyResult = findFrequency(text);

        // Display the results
        System.out.println("Character Frequencies:");
        for (String s : frequencyResult) {
            System.out.println(s);
        }

        scanner.close();
    }
}
