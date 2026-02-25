import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindromeQueueStack(String input) {
        // Remove non-alphanumeric characters and convert to lower case
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanInput.isEmpty()) {
            return true; // Empty strings or strings with only non-alphanumeric characters are palindromes
        }

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and push characters to both data structures
        for (char c : cleanInput.toCharArray()) {
            queue.enqueue(c);
            stack.push(c);
        }

        // Compare dequeue vs pop operations
        while (!queue.isEmpty()) {
            if (queue.dequeue() != stack.pop()) {
                return false; // Not a palindrome
            }
        }

        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String userInput = scanner.nextLine();
        scanner.close();

        if (isPalindromeQueueStack(userInput)) {
            System.out.println("The string \"" + userInput + "\" is a palindrome using Queue and Stack.");
        } else {
            System.out.println("The string \"" + userInput + "\" is not a palindrome using Queue and Stack.");
        }
    }
}
