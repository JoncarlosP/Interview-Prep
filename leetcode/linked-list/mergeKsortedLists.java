/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 
 
 */

// 1. Create a minHeap and insert all the integers in the list
// 2. Create a dummy list and iteratively remove the top element from the minHeap then return  
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode head: lists) {
            while(head != null) {
                minHeap.add(head.val);
                head = head.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while(!minHeap.isEmpty()) {
            head.next = new ListNode(minHeap.remove());
            head = head.next;
        }
        
        return dummy.next;
    }
}
