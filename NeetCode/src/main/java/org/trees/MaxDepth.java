package org.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {

    /*
     * Given the root of a binary tree, return its depth.

    The depth of a binary tree is defined as the number of nodes along the longest path from the root node down to the farthest leaf node.

    Example 1:
    Input: root = [1,2,3,null,null,4]

    Output: 3
    Example 2:

    Input: root = []

    Output: 0
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

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    // Approach: Iterative, Breath first search
    public int maxDepthIterative(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null){
            queue.add(root);
        }

        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            depth++;
        }

        return depth;
    }



}
