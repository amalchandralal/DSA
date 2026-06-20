public class removeGivenNode {
    
}
/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public void deleteNode(ListNode node) {
        // Copy value of next node
        node.val = node.next.val;

        // Skip the next node
        node.next = node.next.next;
    }
}