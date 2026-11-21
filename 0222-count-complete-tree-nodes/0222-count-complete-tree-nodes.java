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
    int totalNodes;
    int leftHeight;
    int rightHeight;

    public int countNodes(TreeNode root) {
       if(root==null) {
        return 0;
       }
        leftHeight=0;
        rightHeight=0;

        TreeNode curr = root;
        while(curr != null){
            leftHeight++;   
            curr = curr.left;
        }
        TreeNode node = root;
        while(node != null){
            rightHeight++;
            node = node.right;
        }

        if(leftHeight==rightHeight){

            totalNodes =((int) Math.pow(2,leftHeight))-1;
            return totalNodes;
        }
               
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}