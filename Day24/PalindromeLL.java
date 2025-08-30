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
    public ListNode reverse(ListNode head){
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

    public boolean isPalindrome(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        count/=2;
        while(count!=0){
            count--;
            temp=temp.next;
        }

        temp = reverse(temp);

        while(temp!=null){
            if(head.val != temp.val)return false;
            head=head.next;
            temp=temp.next;
        }
        return true;
    }
}
