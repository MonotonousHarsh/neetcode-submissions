/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode rootA = headA;
       ListNode rootB = headB;
       HashSet<ListNode> set = new HashSet<>();
       while(rootA != null){
        set.add(rootA);
        rootA = rootA.next;
       }

       while(rootB != null){
        if(set.contains(rootB)){
            return rootB;
        }
        rootB = rootB.next;
       }


      return null;
    }
}