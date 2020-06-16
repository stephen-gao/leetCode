package com.gao.solution.link;

import com.gao.solution.link.node.ListNode;

/**
 * 合并链表
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/05/30 15:49
 **/
public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode point = root;
        while (l1 != null || l2 != null){
            if(l1 == null){
                point.next = l2;
                break;
            }
            if(l2 == null){
                point.next = l1;
                break;
            }
            if(l1.val < l2.val){
                point.next = l1;
                l1 = l1.next;
            }else {
                point.next = l2;
                l2 = l2.next;
            }
            point = point.next;
        }
        return root.next;
    }


    public static void main(String[] args) {
        int[] a1 = {1, 2, 4};
        int[] a2 = {1, 3, 4};
        ListNode l1 = ListNode.build(a1);
        ListNode l2 = ListNode.build(a2);
        ListNode node = mergeTwoLists(l1, l2);
        System.out.println(node);
    }
}
