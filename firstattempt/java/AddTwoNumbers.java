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

import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> l1Digits = new Stack<>();
        Stack<Integer> l2Digits = new Stack<>();
        
	while (l1.next != null) {
            l1Digits.push(l1.val);
            l1 = l1.next;
        }
        while (l2.next != null) {
            l2Digits.push(l2.val);
            l2 = l2.next;
        }
        
        String l1S = "";
        String l2S = "";
        
        while (l1Digits.empty() == false) {
            l1S += (char) l1Strings.pop();
        }
        
        while (l2Digits.empty() == false) {
            l2S += (char) l2Strings.pop();
        }
        
        
        int added = Integer.parseInt(l1S) + Integer.parseInt(l2S);
        
        String resultString = String.valueOf(added);
        
        ListNode firstNode = new ListNode();
        ListNode result = firstNode;
        
        for (int i = resultString.length() - 1; i > -1; i--) {
            firstNode.val = Character.getNumericValue(resultString.charAt(i));
            if (i != 0) {
                firstNode.next = new ListNode(Character.getNumericValue(resultString.charAt(i - 1)));
                firstNode = firstNode.next;
            }
        }
        
        return firstNode;
    }
}