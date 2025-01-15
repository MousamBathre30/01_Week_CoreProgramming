public class VowelConsonantCounter {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase for uniformity
        char lowerChar = Character.toLowerCase(ch);

        // Check if it's a vowel
        if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
            return "Vowel";
        }
        // Check if it's a consonant
        else if (lowerChar >= 'a' && lowerChar <= 'z') {
            return "Consonant";
        }
        // If it's neither, it's not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to find the count of vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            String type = checkCharacterType(currentChar);

            // Increment counters based on the character type
            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the counts as an array
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        // Input string
        String input = "Hello World! 123";

        // Get the counts of vowels and consonants
        int[] counts = countVowelsAndConsonants(input);

        // Display the results
        System.out.println("Input String: \"" + input + "\"");
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
    }
}
