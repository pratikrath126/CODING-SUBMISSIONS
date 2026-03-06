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
        HashMap<ListNode,Integer> ar=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            if(ar.containsKey(temp))
                return true;
            else
                ar.put(temp,1);
            temp=temp.next;
        }
        return false;

    }
}