// LINK -- https://leetcode.com/problems/middle-of-the-linked-list/solution/

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

//OPTIMAL APPROACH - FAST AND SLOW POINTER

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

/*
MY APPROACH - FIND LENGTH, THEN ITERATE LENGHT/2
class Solution {
    
    
    public ListNode middleNode(ListNode head) {
        
        int size = 0;
        
        size = findSize(head,size);
        
        int mid = size / 2;
        
        
        while(mid--> 0){
            
            head = head.next;
            
        }
        
        return head;
    }
    
    static int findSize(ListNode head, int size){
        if(head == null){
            return size;
        }
        
        size += 1;
        
        return findSize(head.next, size);
    }
}

*/
