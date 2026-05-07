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
    -Turtoise-Hare Problem(Floyd's cycle finding algrithm):
        -meaning 2 pointer fast and slow

-TEST CASES:
    - 1->2->3->4 // why is this true????
    - 0->1 // why is this false?

 -FACTS:
    -Cycle: one node in the list that can be visited by the following next pointer??????
        -we are stuck in a loop of visiting the same nodes
        -tail points back to already visited node
        -wtf does this mean?????


// Fast and slow pointers initially points to the head

// Loop that runs while fastPointer and fast.next are not
// null and not equal

// If fast and slow pointer points to the same node,
// then the cycle is detected

 */

class Solution {
    public boolean hasCycle(ListNode head) {
        // assign both slow and fast to head
        ListNode turtoisePointer = head;
        ListNode harePointer = head;

        while(harePointer != null && harePointer.next != null){
            //move pointers by respective slow and fast
            turtoisePointer = turtoisePointer.next; //move pointer by 1 val
            harePointer = harePointer.next.next; // move pointer by 2 val

            if(turtoisePointer == harePointer){
                return true;
            }
        }
        return false;
    }
}
