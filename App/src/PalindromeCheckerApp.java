/**
 MAIN CLASS UseCaselPalindrome App
 *
 Use Case 1: Application Entry & Welcome Nessage
 Description:
 This class represents the entry point of the
 Palindrome Checker Management System.
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
//author Krishdshah
//useCase 2:
//public class PalindromeCheckerApp {
//    public static void main(String[] args) {
//        System.out.println("Welcome to Palindrome Checker App Management System");
//        System.out.println("Modify this logic to usecase 2");
//    }
//}

/**
 * UseCase1PalindromeCheckerApp
 * A console-based Java application to check for palindromes.
 * This class handles the application entry and welcome message (UC1).
 */
public class PalindromeCheckerApp {

    // Define application details as constants
    private static final String APP_NAME = "PalindromeChecker App";
    private static final String APP_VERSION = "1.0.0";

    /**
     * The main entry point for the application.
     * This method is invoked by the JVM at startup.
     *
     * @param args Command line arguments (not used in this use case).
     */
    public static void main(String[] args) {
        // Display the welcome message and application details using console output
        System.out.println("-------------------------------------------------");
        System.out.println("  Welcome to the " + APP_NAME);
        System.out.println("  Version: " + APP_VERSION);
        System.out.println("-------------------------------------------------");
        System.out.println("\nApplication started successfully. Ready for the next use case.\n");
    }
}
