package com.gao.solution.link;

import com.gao.solution.link.node.ListNode;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/05/30 16:36
 **/
public class IsPalindrome {

    public static boolean isPalindrome(ListNode head) {
        if(head ==null || head.next == null){
            return true;
        }
        ListNode pslow = head;
        ListNode pfast = head;
        ListNode pre = null;
        while (pfast != null && pfast.next != null){
            pfast = pfast.next.next;
            pre = pslow;
            pslow = pslow.next;
        }
        pre.next = null;
        if(pfast != null){
            pslow = pslow.next;
        }
        ListNode phead2 = null;
        while (pslow != null){
            ListNode temp = pslow;
            pslow = pslow.next;
            temp.next = phead2;
            phead2 = temp;
        }
        while (head != null && phead2 != null){
            if(phead2.val != head.val){
                return false;
            }
            phead2 = phead2.next;
            head = head.next;
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr = {1,0,0 };
        ListNode head = ListNode.build(arr);
        boolean b = isPalindrome(head);
        System.out.println(b);
    }
}
