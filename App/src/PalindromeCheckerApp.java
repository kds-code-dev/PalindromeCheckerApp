import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindromeDeque(String str) {
        // Create a Deque and a sanitized version of the string
        Deque<Character> deque = new LinkedList<>();
        String sanitizedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Insert characters into the deque
        for (char c : sanitizedStr.toCharArray()) {
            deque.addLast(c);
        }

        // Compare elements from the front and rear
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false; // Not a palindrome
            }
        }

        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Deque-Based Optimized Palindrome Checker App ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPalindromeDeque(input)) {
            System.out.println("The string \"" + input + "\" IS a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" IS NOT a palindrome.");
        }
    }
}
