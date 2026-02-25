//Krish D Shah
//Version 4

//testing git

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = charArray.length - 1;

        // Use a loop to compare characters from both ends
        while (start < end) {
            // If characters at the current pointers do not match, it's not a palindrome
            if (charArray[start] != charArray[end]) {
                return false;
            }
            // Move the pointers towards the center
            start++;
            end--;
        }

        // If the loop completes without returning false, the string is a palindrome
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "madam";
        String test2 = "racecar";
        String test3 = "hello";
        String test4 = "A man a plan a canal Panama"; // Note: This simplistic checker is case-sensitive and space-sensitive

        System.out.println("Is \"" + test1 + "\" a palindrome? " + isPalindrome(test1));
        System.out.println("Is \"" + test2 + "\" a palindrome? " + isPalindrome(test2));
        System.out.println("Is \"" + test3 + "\" a palindrome? " + isPalindrome(test3));
        System.out.println("Is \"" + test4 + "\" a palindrome? " + isPalindrome(test4));
    }
}
