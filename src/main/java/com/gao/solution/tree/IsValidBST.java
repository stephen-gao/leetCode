package com.gao.solution.tree;

import com.gao.solution.tree.node.TreeNode;

import java.util.Stack;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/06 11:26
 **/
public class IsValidBST {

    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (!stack.empty() || node != null){
            while (node != null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            if(pre != null && node.val <= pre.val){
                return false;
            }
            pre = node;
            System.out.println(node.val);
            if(node.right == null){
                node = null;
            }else {
                node = node.right;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] array = {1 ,null ,2};
        TreeNode root = TreeNode.buildTree(array);
        boolean b = isValidBST(root);
        System.out.println(b);
    }
}
