package com.gao.solution.tree.node;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/06 10:08
 **/
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }


    public static TreeNode buildTree(Integer[] array) {
        int length = array.length;
        TreeNode[] nodes = new TreeNode[length];
        for (int i = 0; i < length; i++) {
            Integer n = array[i];
            if(n != null) {
                TreeNode node = new TreeNode(array[i]);
                nodes[i] = node;
            }else {
                nodes[i] = null;
            }
        }
        for (int i = 0; i < length; i++) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            if(l < length) {
                nodes[i].left = nodes[l];
            }
            if(r < length){
                nodes[i].right = nodes[r];
            }
        }
        return nodes[0];
    }
}
