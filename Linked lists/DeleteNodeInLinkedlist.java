//leetcode 237--Delete node in a linkedlist
class Solution {
    public void deleteNode(ListNode node) {
       node.val=node.next.val;
       node.next=node.next.next;
    }
}