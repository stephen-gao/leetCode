package com.gao.solution.tree;

import com.gao.solution.tree.node.TreeNode;

import java.util.*;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/06 15:32
 **/
public class LevelOrder {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return Collections.EMPTY_LIST;
        }
        List<List<Integer>> levels = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        List<Integer> nodes = new ArrayList<>();
        ArrayDeque<TreeNode> next = new ArrayDeque<>();
        queue.addLast(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.pollFirst();
            nodes.add(node.val);
            if(node.left != null){
                next.addLast(node.left);
            }
            if(node.right != null){
                next.addLast(node.right);
            }
            if(queue.isEmpty()){
                levels.add(nodes);
                queue = next;
                nodes = new ArrayList<>();
                next = new ArrayDeque<>();
            }
        }

        return levels;
    }

    public static void main(String[] args) {
        Integer[] array = {3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeNode.buildTree(array);
        List<List<Integer>> list = levelOrder(root);
    }
}
