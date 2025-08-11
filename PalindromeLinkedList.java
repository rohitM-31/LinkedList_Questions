class ListNode {
    int data;
    ListNode next;

    ListNode(int d) {
        this.data = d;
        this.next = null;
    }
}

public class PalindromeLinkedList {

    // Helper function to reverse a linked list
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    // Function to check if the linked list is a palindrome
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        // Step 1: Find middle
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode secondHalfStart = reverse(slow.next);

        // Step 3: Compare both halves
        ListNode firstHalf = head;
        ListNode secondHalf = secondHalfStart;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Print function for verification
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        printList(head);

        if (isPalindrome(head))
            System.out.println("The linked list is a palindrome.");
        else
            System.out.println("The linked list is not a palindrome.");
    }
}
