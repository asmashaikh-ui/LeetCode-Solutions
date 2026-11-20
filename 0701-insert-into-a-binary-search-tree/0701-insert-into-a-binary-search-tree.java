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
    public TreeNode insertIntoBST(TreeNode root, int val) {

        return insertRecursive(root, val);
    }
    private TreeNode insertRecursive(TreeNode node, int val){

        if(node==null){
            return new TreeNode(val);
        }

        if(node.val>val){
            node.left =  insertRecursive(node.left, val);
        }

        if(node.val<val){
            node.right = insertRecursive(node.right, val);
        }

        return node;
    }
}