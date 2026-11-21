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
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        if(root==null){
            return sum;
        }
        return Sum(root, low, high);
    }
    int Sum(TreeNode root, int low, int high){
        if(root==null){
            return sum;
        }
        if(low <= root.val && root.val <= high){
            sum+=root.val;
        }
        // if(low < root.val && root.val < high){
        //     Sum(root.left,low, high);
        //     Sum(root.right, low, high);
        // }
        if(root.val >= low){
            Sum(root.left, low, high);
        }
        if(root.val <= high){
            Sum(root.right, low, high);
        }
        return sum;
    }
}