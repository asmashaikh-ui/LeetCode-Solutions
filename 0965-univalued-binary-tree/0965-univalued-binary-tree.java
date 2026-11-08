/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        int uniValue=root.val;

        return traversal(root, uniValue);
    }
    boolean traversal(TreeNode root, int uniValue){
     
        if(root==null){
            return true;
        }

        if(root.val!=uniValue){
            return false;
        }
        return traversal(root.left, uniValue)&&traversal(root.right, uniValue);
    }
}