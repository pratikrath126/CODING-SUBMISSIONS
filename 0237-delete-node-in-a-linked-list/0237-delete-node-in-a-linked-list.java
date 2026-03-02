/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode x=null;
        while(node.next!=null){
            node.val=node.next.val;
            x=node;
            node=node.next;
        }
        x.next=null;
    }
}