package org.trees;

public class BinaryTreeDiameter {

    /*
     * 
     * The diameter of a binary tree is defined as the length of the longest path between any two nodes within the tree. The path does not necessarily have to pass through the root.

    The length of a path between two nodes in a binary tree is the number of edges between the nodes.

    Given the root of a binary tree root, return the diameter of the tree.

    Example 1:

    Input: root = [1,null,2,3,4,5]

    Output: 3
    Explanation: 3 is the length of the path [1,2,3,5] or [5,3,2,4].

    Example 2:

    Input: root = [1,2,3]

    Output: 2
    Constraints:

    1 <= number of nodes in the tree <= 100
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

    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        dfs(root, res);
        return res[0];
    }


    private int dfs(TreeNode root, int[] res) {
        if(root == null){
            return 0;
        }

        int left = dfs(root.left, res);
        int right = dfs(root.right, res);

        res[0] = Math.max(res[0], left + right);
        return 1 + Math.max(left, right);       
    }

}
