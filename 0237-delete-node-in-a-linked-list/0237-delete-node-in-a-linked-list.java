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
        ListNode x=node;  //x is current 
        ListNode y=null;  //y is prev
        while(x.next!=null){
            x.val=x.next.val;
            y=x;
            x=x.next;
        }
        y.next=null;
    }
}