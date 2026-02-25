import java.util.Scanner;
import java.lang.System;

public class PalindromeCheckerApp {

    // Algorithm 1: Two-Pointer Method
    public static boolean isPalindromeTwoPointers(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Algorithm 2: StringBuilder Method
    public static boolean isPalindromeStringBuilder(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Algorithm 3: Recursive Method
    public static boolean isPalindromeRecursive(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return checkPalindromeRecursive(cleaned, 0, cleaned.length() - 1);
    }

    private static boolean checkPalindromeRecursive(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return checkPalindromeRecursive(s, left + 1, right - 1);
    }

    // Performance comparison method
    public static void comparePerformance(String inputString) {
        int iterations = 10000; // Run multiple times for better average and JIT optimization

        System.out.println("Input String: \"" + inputString + "\"");
        System.out.println("Running each algorithm " + iterations + " times...");

        // Measure Two-Pointer Method
        long startTime1 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            isPalindromeTwoPointers(inputString);
        }
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1) / iterations;

        // Measure StringBuilder Method
        long startTime2 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            isPalindromeStringBuilder(inputString);
        }
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2) / iterations;

        // Measure Recursive Method
        long startTime3 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            isPalindromeRecursive(inputString);
        }
        long endTime3 = System.nanoTime();
        long duration3 = (endTime3 - startTime3) / iterations;

        // Display Results
        System.out.println("\n--- Performance Results (Average NanoTime per run) ---");
        System.out.println("1. Two-Pointer Method: " + duration1 + " ns");
        System.out.println("2. StringBuilder Method: " + duration2 + " ns");
        System.out.println("3. Recursive Method:    " + duration3 + " ns");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome and compare performance:");
        String input = scanner.nextLine();
        scanner.close();

        comparePerformance(input);
    }
}
