import java.util.HashSet;

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> seen = new HashSet<>();
        ListNode current = head;
        
        while (current != null) {
            if (seen.contains(current)) {
                return true; // Node already visited, cycle found
            }
            seen.add(current);
            current = current.next;
        }
        
        return false; // Reached null, no cycle
    }
}
