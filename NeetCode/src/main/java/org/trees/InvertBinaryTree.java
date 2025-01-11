package org.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeModel;

public class InvertBinaryTree {

    /*
     * Invert Binary Tree
    You are given the root of a binary tree root. Invert the binary tree and return its root.

    Example 1:
    Input: root = [1,2,3,4,5,6,7]
    Output: [1,3,2,7,6,5,4]

    Example 2:
    Input: root = [3,2,1]
    Output: [3,1,2]
    Example 3:

    Input: root = []

    Output: []
    Constraints:

    0 <= The number of nodes in the tree <= 100.
    -100 <= Node.val <= 100

     */

     public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Approach: Iterative, Breath first search
    public TreeNode invertTreeItterative(TreeNode root) {
        if(root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }

    // Approach: Recursive
    public TreeNode invTreeNodeRecutsive(TreeNode root){
        if(root == null) {
            return null;
        }
        
        TreeNode node = new TreeNode(root.val);
        node.right = invTreeNodeRecutsive(root.left);
        node.left = invTreeNodeRecutsive(root.right);
        return node;
    }

    // Approach: Iterative, stack
    public TreeNode invTreeNodeItterativeStack(TreeNode root){
        if(root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left != null) {
                stack.push(node.left);
            }
            if(node.right != null) {
                stack.push(node.right);
            }
        }
        return root;
    }



}
