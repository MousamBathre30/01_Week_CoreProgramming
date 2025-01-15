public class TrimString {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean customCompare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Input string with leading and trailing spaces
        String input = "   Hello World!   ";
        System.out.println("Original String: \"" + input + "\"");

        // Trim spaces using custom method
        int[] indices = findTrimIndices(input);
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
        System.out.println("Trimmed String (Custom Method): \"" + trimmedCustom + "\"");

        // Trim spaces using built-in method
        String trimmedBuiltIn = input.trim();
        System.out.println("Trimmed String (Built-in Method): \"" + trimmedBuiltIn + "\"");

        // Compare the results
        boolean isEqual = customCompare(trimmedCustom, trimmedBuiltIn);
        System.out.println("Do both methods produce the same result? " + isEqual);
    }
}
