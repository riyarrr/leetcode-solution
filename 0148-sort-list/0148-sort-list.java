class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        // Store all values in ArrayList
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        // Sort the ArrayList
        Collections.sort(arr);

        // Put sorted values back into linked list
        temp = head;

        for (int i = 0; i < arr.size(); i++) {
            temp.val = arr.get(i);
            temp = temp.next;
        }

        return head;
    }
}