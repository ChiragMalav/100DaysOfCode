class Solution {
    public int length(Node slow , Node fast){
        int cnt = 1;
        fast = fast.next;
        
        while(fast!=slow){
            cnt++;
            fast = fast.next;
        }
        return cnt;
    }
    
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast){
                return length(slow,fast);
            }
        }
        return 0;
    }
}
