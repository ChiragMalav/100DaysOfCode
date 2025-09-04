class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(head==null)return head;
        
        int length=1;
        Node dummy = head;
        while(dummy.next!=null){
            dummy=dummy.next;
            length++;
        }
        
        int pos = k%length;
        if(pos==0)return head;
        
        Node curr = head;
        
        for(int i =0;i<pos-1;i++){
            curr=curr.next;
        }
        Node newHead = curr.next;
        curr.next = null;
        dummy.next = head;
        
        return newHead;
    }
}
