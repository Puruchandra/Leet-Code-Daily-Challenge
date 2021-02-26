//LINK-  https://leetcode.com/problems/merge-k-sorted-lists/

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
    public ListNode mergeKLists(ListNode[] lists) {
	    
        int k = lists.length;
	if (k < 1)
		return null;
	// Dummy Node at Head
	ListNode head = new ListNode();
	// Last Node of Sorted List
	ListNode last = head;
	// Create a Priority Queue to Hold Head of Each List
	// Space Complexity O(k)
	// Time Complexity O(1)
	Queue<ListNode> q = new PriorityQueue<>(k,(ListNode l1, ListNode l2)->l1.val-l2.val);
	// Initialize Priority Queue
	// Time Complexity O(k*log(k))
	for (int i=0; i<k; i++)
		if (lists[i] != null)
			// Time Complexity O(log(k))
			q.add(lists[i]);
	// While more than one list in Queue
	// Worst Case Time Complexity O(Nlog(k)) where N is number of nodes in all queues
	while (q.size() > 1) {
		// Time Complexity O(log(k))
		ListNode current = q.remove();
		last.next = current;
		last = current;
		if (current.next != null)
			// Time Complexity O(log(k))
			q.add(current.next);
	}
	if (q.size() > 0) {
		// Time Complexity O(log(k))
		ListNode current = q.remove();
		last.next = current;
	}
	return head.next;
    }
}
