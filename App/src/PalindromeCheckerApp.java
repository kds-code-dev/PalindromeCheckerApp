/**
 MAIN CLASS UseCasePalindrome App
 Use Case 1: Application Entry & Welcome Message
 Description:
 This class represents the entry point of the
 At this stage, the application:
 Starts execution from the main() method
 Displays a welcome message
 Shows application version
 No palindrome logic is implemented yet.
 The goal is to establish a clear startup flow.
 @Krish  D Shah
  * @version 1.8
 */

//public class PalindromeCheckerApp {
//
//    /**
//     * Krish D Shah RA2411026010004 V1.0
//     */
//    public static boolean isPalindrome(String s) {
//        // Create a StringBuilder with the original string
//        StringBuilder reversed = new StringBuilder(s);
//
//        // Reverse the StringBuilder and convert it back to a String
//        reversed.reverse();
//        String reversedString = reversed.toString();
//
//        // Compare the original string with the reversed one
//        // Use equals() for case-sensitive comparison, or equalsIgnoreCase() for case-insensitive
//        return s.equals(reversedString);
//    }
//
//    public static void main(String[] args) {
//        String testString1 = "madam";
//        String testString2 = "world";
//
//        System.out.println(testString1 + " is a palindrome: " + isPalindrome(testString1));
//        System.out.println(testString2 + " is a palindrome: " + isPalindrome(testString2));
//    }
//}


// version 2.0
//author Krish d shah
//useCase 2:

/**
 * UseCase1PalindromeCheckerApp
 * A console-based Java application to check for palindromes.
 * This class handles the application entry and welcome message (UC1).
 */// Define application details as constants
private static final String APP_NAME = "PalindromeChecker App";
private static final String APP_VERSION = "3.0.0";

/**
 * The main entry point for the application.
 * This method is invoked by the JVM at startup.
 *
 */
void main() {
    // Display the welcome message and application details using console output
    IO.println("-------------------------------------------------");
    IO.println("  Welcome to the " + APP_NAME);
    IO.println("  Version: " + APP_VERSION);
    IO.println("-------------------------------------------------");
    IO.println("\nApplication started successfully. Ready for the next use case.\n");
}
