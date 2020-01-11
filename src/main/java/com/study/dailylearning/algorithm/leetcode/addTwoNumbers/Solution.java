package com.study.dailylearning.algorithm.leetcode.addTwoNumbers;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-01-11
 **/
public class Solution {


    public static void main(String[] args) {



    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode curryNode = resultNode;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            if (carry > 0) {
                curryNode.next = new ListNode(sum % 10);
            } else {
                curryNode.next = new ListNode(sum);
            }
            curryNode = curryNode.next;
            l1 = l1==null? null:l1.next;
            l2 = l2==null? null:l2.next;
        }
        if (carry > 0) {
            curryNode.next = new ListNode(carry);
        }
        return resultNode.next;
    }


    public static class ListNode {
     int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }

}

