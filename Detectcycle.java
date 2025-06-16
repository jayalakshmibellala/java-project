package xyz;

// Definition for singly-linked list.
// If you're running this in an environment where ListNode is already defined (like LeetCode),
// you might not need to include this definition.
// For standalone compilation, you'll need it.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Detectcycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    public static void main(String[] args) {
        System.out.println("--- Detect Cycle in a Linked List ---");

        // --- Hardcoded Input 1: List with a cycle ---
        System.out.println("\nTest Case 1: List with a cycle (3 -> 2 -> 0 -> -4, with -4 pointing to 2)");
        ListNode head1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeNeg4 = new ListNode(-4);

        head1.next = node2;
        node2.next = node0;
        node0.next = nodeNeg4;
        nodeNeg4.next = node2; // Creates a cycle

        System.out.println("Has Cycle: " + hasCycle(head1)); // Expected: true

        // --- Hardcoded Input 2: List without a cycle ---
        System.out.println("\nTest Case 2: List without a cycle (1 -> 2)");
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println("Has Cycle: " + hasCycle(head2)); // Expected: false

        // --- Hardcoded Input 3: Empty list ---
        System.out.println("\nTest Case 3: Empty list");
        ListNode head3 = null;
        System.out.println("Has Cycle: " + hasCycle(head3)); // Expected: false

        // --- Hardcoded Input 4: Single node list ---
        System.out.println("\nTest Case 4: Single node list (1)");
        ListNode head4 = new ListNode(1);
        System.out.println("Has Cycle: " + hasCycle(head4)); // Expected: false
    }
}