/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupTail = dummy;

        while (true) {
            ListNode kthNode = getKthNode(prevGroupTail, k);
            if (kthNode == null) {
                break;
            }

            ListNode nextGroupHead = kthNode.next;
            ListNode groupHead = prevGroupTail.next;

            // 2. Reverse the k nodes
            ListNode prev = nextGroupHead;
            ListNode curr = groupHead;

            while (curr != nextGroupHead) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }

            prevGroupTail.next = kthNode;
                        prevGroupTail = groupHead;
        }

        return dummy.next;
    }

    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}
