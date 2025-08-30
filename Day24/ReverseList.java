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
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode temp = head.next;
        prev.next=null;
        while(temp!=null){
            temp=temp.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
