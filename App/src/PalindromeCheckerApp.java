import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Palindrome Checker (Case/Space Insensitive) ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    /**
     * UC10: Checks if a string is a palindrome ignoring case and spaces.
     * Flow: Normalize string -> Apply logic
     */
    public static boolean isPalindrome(String text) {
        if (text == null) return false;

        // 1. Normalize: Convert to lowercase and remove spaces/non-alphanumeric characters
        // \s matches spaces, [^a-zA-Z0-9] matches anything not a letter/number
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 2. Palindrome Logic: Compare with reverse
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
