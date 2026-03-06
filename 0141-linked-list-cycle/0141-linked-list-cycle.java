/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> ar=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            if(ar.contains(temp))
                return true;
            else
                ar.add(temp);
            temp=temp.next;
        }
        return false;

    }
}