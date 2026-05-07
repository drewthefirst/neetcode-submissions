/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

 -ALGO:
    -save next node
    -reverse the pointer
    -move pointers forward; reassign accordingly

    1->2->3->null         becomes         3->2->1->null
    head = 1                                head = 1
    head.next = 2                           head.next = null
    prev = null                             prev = 2
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;

        // loop through list - use while loop
        while(head != null){
            ListNode nextNode = head.next; // creates nextNode for save
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        return prevNode;
    }
}
