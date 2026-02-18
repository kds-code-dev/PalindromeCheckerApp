public class PalindromeCheckerApp {

    /**
     * Krish D Shah RA2411026010004 V1.0
     */
    public static boolean isPalindrome(String s) {
        // Create a StringBuilder with the original string
        StringBuilder reversed = new StringBuilder(s);

        // Reverse the StringBuilder and convert it back to a String
        reversed.reverse();
        String reversedString = reversed.toString();

        // Compare the original string with the reversed one
        // Use equals() for case-sensitive comparison, or equalsIgnoreCase() for case-insensitive
        return s.equals(reversedString);
    }

    public static void main(String[] args) {
        String testString1 = "madam";
        String testString2 = "world";

        System.out.println(testString1 + " is a palindrome: " + isPalindrome(testString1));
        System.out.println(testString2 + " is a palindrome: " + isPalindrome(testString2));
    }
}
