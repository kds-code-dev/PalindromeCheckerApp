import java.util.Scanner;
import java.util.Stack;
//krishdshah vscode v4
public class PalindromeCheckerApp {

    /**
     * Checks if a given string is a palindrome using a Stack data structure.
     * The method processes the string by pushing all characters onto a stack,
     * which inherently reverses their order, and then compares the reversed
     * string with the original.
     *
     * @param str The input string to check for being a palindrome.
     * @return true if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindromeUsingStack(String str) {
        // Remove non-alphanumeric characters and convert to lower case for a more robust check
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanStr.isEmpty()) {
            return true; // An empty or clean string is considered a palindrome
        }

        Stack<Character> stack = new Stack<>();

        // Push all characters of the clean string onto the stack
        for (char c : cleanStr.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack to build the reversed string
        StringBuilder reversedStrBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStrBuilder.append(stack.pop());
        }

        String reversedStr = reversedStrBuilder.toString();

        // Compare the reversed string with the original clean string
        return cleanStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome Checker App - Use Case 5: Stack-Based Validation");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPalindromeUsingStack(input)) {
            System.out.println("Result: \"" + input + "\" IS a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" IS NOT a palindrome.");
        }
    }
}
