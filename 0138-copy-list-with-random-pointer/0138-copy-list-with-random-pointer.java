/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hs=new HashMap<>();
        Node temp=head;
        hs.put(null,null);
        while(temp!=null){
            Node copy=new Node(temp.val);
            hs.put(temp,copy);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node copy=hs.get(temp);
            copy.next=hs.get(temp.next);
            copy.random=hs.get(temp.random);
            temp=temp.next;
        }
        return hs.get(head);
    }
    
}