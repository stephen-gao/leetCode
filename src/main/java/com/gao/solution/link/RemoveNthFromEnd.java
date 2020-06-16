package com.gao.solution.link;

import com.gao.solution.link.node.ListNode;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/05/30 14:58
 **/
public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode point = head;
        while (point.next != null) {
            point = point.next;
            count++;
        }
        int i = count - n;
        if(i == 0){
            return head.next;
        }
        count = 1;
        point = head;
        while (count < i){
            point = point.next;
            count++;
        }
        point.next = point.next.next;
        return head;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = ListNode.build(arr);
        removeNthFromEnd(head, 2);
    }


}
