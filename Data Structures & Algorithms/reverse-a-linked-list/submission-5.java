/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

 -INTUITION:
    -save next node
    -remove pointers
    -reassign links

    1->2->3->null       becomes     null->3->2->1
    head=1                              head=1
    nextNode=2                          nextNode=null
    prevNode=null                       prevNode=2

    iterate through list while not null
    create const for nextNode as head.next
    move head.next to null(prevNode)
    reassign prevNode as head
    reassign head to nextNode
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;

        while(head != null){
            ListNode nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        return prevNode;
    }
}
