package com.gao.solution.link.node;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/05/30 15:23
 **/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }


    public static ListNode build(int[] arr,int pos){
        ListNode head = null;
        ListNode posNode = null;
        ListNode last = null;
        for (int i = 0; i < arr.length; i++) {
            last = new ListNode(arr[i]);
            if(pos == i){
                posNode = last;
            }
            head = append(head,last);
        }
        last.next = posNode;
        return head;
    }

    public static ListNode build(int[] arr){
        ListNode head = null;
        for (int i = 0; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            head = append(head,node);
        }
        return head;
    }

    public static ListNode append(ListNode root,ListNode node){
        if(root == null){
            root = node;
        }else {
            ListNode point = root;
            while (point.next != null){
                point = point.next;
            }
            point.next = node;
        }
        return root;
    }
}
