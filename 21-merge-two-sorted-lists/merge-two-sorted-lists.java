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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> res = new ArrayList<>();
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 != null){
            res.add(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            res.add(temp2.val);
            temp2 = temp2.next;
        }
        Collections.sort(res);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(Integer x:res){
            curr.next = new ListNode(x);
            curr = curr.next;
        }

        return dummy.next;
    }
}