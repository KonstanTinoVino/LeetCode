package org.linked_lists;

public class MergeSortedLists {

    /*
    You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists into one sorted linked list and return the head of the new sorted linked list.

    The new list should be made up of nodes from list1 and list2.

    Example 1:

    Input: list1 = [1,2,4], list2 = [1,3,5]

    Output: [1,1,2,3,4,5]
    Example 2:

    Input: list1 = [], list2 = [1,2]

    Output: [1,2]
    Example 3:

    Input: list1 = [], list2 = []

    Output: []
    Constraints:

    0 <= The length of the each list <= 100.
    -100 <= Node.val <= 100
     */

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        if (list1 != null){
            node.next = list1;
        } else {
            node.next = list2;
        }
        return dummy.next;
    }

}
