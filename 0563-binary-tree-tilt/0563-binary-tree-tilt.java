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

    int totalTilt=0;

    public int findTilt(TreeNode root) {
        
        totalTilt=0;

        postOrderHelper(root);

        return totalTilt;
    }

    int postOrderHelper(TreeNode root){
        
        if(root==null){
            return 0;
        } 
        
        int leftSum = postOrderHelper(root.left);
        
        int rightSum = postOrderHelper(root.right);
        
        totalTilt += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }
}