class Solution {
    public Node reverseKGroup(Node head, int k) {
        // code here
        if(head==null)return null;
        Node tail = head;
        
        int count = 0; 
        for(int i = 0;((i<k)&&(tail!=null)) ;i++){
            tail=tail.next;
            count++;
        }
        
        Node newHead = reverse(head,tail);
        if(count==k){
        head.next = reverseKGroup(tail,k);
        }
        
        return newHead;
    }
    
    public Node reverse(Node curr , Node end){
        Node prev = null;
        while(curr!=end){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
