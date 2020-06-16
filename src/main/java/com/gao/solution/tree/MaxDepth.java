package com.gao.solution.tree;

import com.gao.solution.tree.node.TreeNode;
import javafx.util.Pair;

import java.util.Stack;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/06 10:08
 **/
public class MaxDepth {

    //递归
//    public static int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int depth = 1;
//        int ldepth = maxDepth(root.left);
//        int rdepth = maxDepth(root.right);
//        int next = ldepth > rdepth ? ldepth : rdepth;
//        depth += next;
//        return depth;
//    }
    //栈
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        int dep = 0;
        Pair<TreeNode,Integer> pair = new Pair<>(root,1);
        Stack<Pair<TreeNode,Integer>> stack = new Stack<>();
        stack.push(pair);
        TreeNode p ;
        while (!stack.empty()){
            Pair<TreeNode,Integer> temp = stack.pop();
            dep = temp.getValue();
            p = temp.getKey();
            max = max > dep? max : dep;
            if(p.left != null){
                pair = new Pair<>(p.left,dep+1);
                stack.add(pair);
            }
            if(p.right != null){
                pair = new Pair<>(p.right,dep+1);
                stack.add(pair);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Integer[] array = {3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeNode.buildTree(array);
        int i = maxDepth(root);
        System.out.println(i);
    }
}
