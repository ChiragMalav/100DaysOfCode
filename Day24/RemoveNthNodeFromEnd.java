/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slowp = head;
        ListNode fastp = head;

        for(int i=0;i<n;i++){
            fastp=fastp.next;
        }

        if(fastp==null){
            return head.next;
        }

        while(fastp.next!=null){
            slowp=slowp.next;
            fastp=fastp.next;
        }

        ListNode delNode = slowp.next;
        slowp.next = slowp.next.next;
        delNode = null;

        return head;
    }
}
