package com.gao.solution.link;

import com.gao.solution.link.node.ListNode;

/**
 * 翻转链表
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/05/30 15:34
 **/
public class ReverseList {


    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode root = head;
        ListNode point = head.next;
        while (point != null) {
            head.next = point.next;
            point.next = root;
            root = point;
            point = head.next;
        }
        head.next = null;
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {};
        ListNode head = ListNode.build(arr);
        ListNode node = reverseList(head);
        System.out.println(node);
    }
}
