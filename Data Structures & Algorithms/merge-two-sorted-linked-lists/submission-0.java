/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

Create a dummy node for the new list
Keep a current pointer to the end of the merged list
Compare list1.val and list2.val
Attach the smaller node to current.next
Move that list forward
Move current forward
When one list ends, attach the rest of the other list


1->2->3         1->1->3->4              1->1->1->2->3->3->4
h=1             h=1                     l1 l2 l1 l1 l2 l1 l2
n=2             n=1                     

-INTUITION
    - create a new list node for new list
    - iterate through each list while != null
    - compare the l1.val to l2.val if <= then attach that value to our new list or vice versa
        - add something to new linkedlist -> newList.next=list1
    -
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // create empty LL/LN
        ListNode dummy = new ListNode();
        ListNode mergedList = dummy;
        // ListNode p1 = list1.val; ListNode p2 = list2.val;
        // iterate through both LL
        while(list1 != null && list2 != null){
            if(list1.val<=list2.val){
                mergedList.next = list1; // add current val to new list
                list1 = list1.next; // move pointer forward
            } else {
                mergedList.next = list2; // add current val to new list
                list2 = list2.next; // move pointer forward
            }
            mergedList = mergedList.next; // 
        }
        // one list end attach the rest of the other
        if(list1 == null){
            mergedList.next = list2;
        } else{
            mergedList.next = list1;

        }
    
        return dummy.next;
    }
}