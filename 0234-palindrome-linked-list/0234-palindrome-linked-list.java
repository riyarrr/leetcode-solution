class Solution {

    public ListNode reversedLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reversedLinkedList(head.next);

        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        
        ListNode newHead = reversedLinkedList(slow.next);

        ListNode first = head;
        ListNode second = newHead;

        
        while (second != null) {
            if (first.val != second.val) {
                reversedLinkedList(newHead);
                return false;
            }

            first = first.next;
            second = second.next;
        }

        
        reversedLinkedList(newHead);

        return true;
    }
}