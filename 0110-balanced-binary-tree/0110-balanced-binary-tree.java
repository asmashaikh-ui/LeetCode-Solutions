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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        return height(root) != Integer.MIN_VALUE;
    }

    int height(TreeNode root){

        if(root==null){ return -1;}
        
        int leftHeight = height(root.left);
        if(leftHeight==Integer.MIN_VALUE){return Integer.MIN_VALUE;}
        
        int rightHeight = height(root.right);
        if(rightHeight==Integer.MIN_VALUE){return Integer.MIN_VALUE;}

        if(Math.abs(leftHeight-rightHeight) <=1){ 
            return 1 + Math.max(leftHeight, rightHeight);
        }
        else{ return Integer.MIN_VALUE;}
    }
}