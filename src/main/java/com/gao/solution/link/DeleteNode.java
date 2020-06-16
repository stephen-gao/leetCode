package com.gao.solution.link;

import com.gao.solution.link.node.ListNode;

/**
 * 删除链表中的节点
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/05/30 14:14
 **/
public class DeleteNode {

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }


    public static void main(String[] args) {
        int[] arr = {4,5,1,9};
        ListNode head = ListNode.build(arr);
        System.out.println(head);
        ListNode dn = new ListNode(5);
        deleteNode(dn);
    }


}
