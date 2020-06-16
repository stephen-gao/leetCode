package com.gao.solution.link;

import com.gao.solution.link.node.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/02 20:13
 **/
public class HasCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if(fast == null|| fast.next == null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 0, -4};
        int pos = -1;
        ListNode head = ListNode.build(arr, pos);
        boolean hasCycle = hasCycle(head);
        System.out.println(hasCycle);
    }
}
