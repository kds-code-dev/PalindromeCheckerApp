public class PalindromeChecker {

    /**
     * Checks if a given string is a palindrome, ignoring case and non-alphanumeric characters.
     *
     * @param input The string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    public boolean checkPalindrome(String input) {
        if (input == null) {
            return false;
        }

        // Preprocess the string: convert to lowercase and remove non-alphanumeric characters.
        // This makes the check case-insensitive and handles spaces/punctuation.
        String cleanString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use a two-pointer approach with the internal String data structure (char array)
        int left = 0;
        int right = cleanString.length() - 1;

        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Is a palindrome
    }
}
