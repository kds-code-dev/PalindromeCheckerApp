public class UseCase8PalindromeCheckerApp {

    static class ListNode {
        char val;
        ListNode next;
        ListNode(char val) {
            this.val = val;
        }
    }

    /**
     * Helper method to convert a string to a Singly Linked List
     */
    public static ListNode stringToLinkedList(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        ListNode head = new ListNode(s.charAt(0));
        ListNode current = head;
        for (int i = 1; i < s.length(); i++) {
            current.next = new ListNode(s.charAt(i));
            current = current.next;
        }
        return head;
    }

    /**
     * Reverses a singly linked list in-place
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }

    /**
     * Checks if a singly linked list is a palindrome
     */
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find the middle of the linked list using fast and slow pointers
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half of the list
        ListNode secondHalfHead = reverseList(slow.next);

        // Disconnect the first half from the second half temporarily for clarity
        slow.next = null;

        // 3. Compare the first half and the reversed second half
        ListNode p1 = head;
        ListNode p2 = secondHalfHead;
        boolean isPalindrome = true;
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                isPalindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Optional: Reconstruct the original list if needed (not required for this problem, but good practice)
        // reverseList(secondHalfHead); // Re-reverse the second half
        // slow.next = secondHalfHead;  // Reconnect

        return isPalindrome;
    }

    public static void main(String[] args) {
        String testString1 = "madam";
        String testString2 = "racecar";
        String testString3 = "hello";

        ListNode list1 = stringToLinkedList(testString1);
        ListNode list2 = stringToLinkedList(testString2);
        ListNode list3 = stringToLinkedList(testString3);

        System.out.println("Testing string: \"" + testString1 + "\"");
        System.out.println("Is palindrome? " + isPalindrome(list1)); // Expected: true

        System.out.println("\nTesting string: \"" + testString2 + "\"");
        System.out.println("Is palindrome? " + isPalindrome(list2)); // Expected: true

        System.out.println("\nTesting string: \"" + testString3 + "\"");
        System.out.println("Is palindrome? " + isPalindrome(list3)); // Expected: false
    }
}
