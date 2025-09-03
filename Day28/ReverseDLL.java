class Solution {
    public Node reverse(Node head) {
        // code here
        if(head==null || head.next==null)return head;
        
        Node last = null;
        Node curr = head;
        
        while(curr!=null){
            last = curr.prev;
            
            curr.prev = curr.next;
            
            curr.next = last;
            
            curr = curr.prev;
        }
        return last.prev;
    }
}
