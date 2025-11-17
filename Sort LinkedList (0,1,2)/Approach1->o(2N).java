class Solution {
    static Node segregate(Node head) {
        if (head == null) return head;

        int count0 = 0, count1 = 0, count2 = 0;

        Node temp = head;

        // Count occurrences
        while (temp != null) {
            if (temp.data == 0) count0++;
            else if (temp.data == 1) count1++;
            else count2++;
            temp = temp.next;
        }

        // Refill values
        temp = head;

        while (temp != null) {
            if (count0 > 0) {
                temp.data = 0;
                count0--;
            } else if (count1 > 0) {
                temp.data = 1;
                count1--;
            } else {
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }

        return head;
    }
}
