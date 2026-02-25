import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

// PalindromeStrategy.java
interface PalindromeStrategy {
    boolean isPalindrome(String s);
}

// StackStrategy.java
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : cleanString.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return cleanString.equals(reversedString.toString());
    }
}

// DequeStrategy.java
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : cleanString.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// PalindromeChecker.java
class PalindromeChecker {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String s) {
        if (strategy == null) {
            throw new IllegalStateException("Palindrome strategy not set.");
        }
        return strategy.isPalindrome(s);
    }
}

// PalindromeCheckerApp.java
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        while (true) {
            System.out.println("\nSelect Palindrome Algorithm Strategy:");
            System.out.println("1. Stack Strategy");
            System.out.println("2. Deque Strategy");
            System.out.println("3. Exit");
            System.out.print("Enter choice (1-3): ");
            String choice = scanner.nextLine();

            if (choice.equals("3")) {
                break;
            }

            switch (choice) {
                case "1":
                    checker.setStrategy(new StackStrategy());
                    System.out.println("Stack Strategy selected.");
                    break;
                case "2":
                    checker.setStrategy(new DequeStrategy());
                    System.out.println("Deque Strategy selected.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.print("Enter a string to check: ");
            String input = scanner.nextLine();

            if (checker.check(input)) {
                System.out.println("Result: \"" + input + "\" is a palindrome.");
            } else {
                System.out.println("Result: \"" + input + "\" is not a palindrome.");
            }
        }
        scanner.close();
        System.out.println("Application exited.");
    }
}
