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
    public TreeNode deleteNode(TreeNode root, int key) {
        return deleteRecursive(root, key);
    }
    private TreeNode deleteRecursive(TreeNode node, int key){

        if(node==null){ return null;}

        if(node.val>key){
           node.left = deleteRecursive(node.left, key);
        }

        else if(node.val<key){
            node.right = deleteRecursive(node.right, key);
        }
        
        else{
            // leaf node
            if(node.right==null && node.left==null){
                node=null;
                return null;
            }
            // only one child
            else if(node.right==null){
                TreeNode left = node.left;
                node=null;
                return left;
            }
            else if(node.left==null){
                TreeNode right = node.right;
                node=null;
                return right;
            }
            // replace with predecessor-two child
            else{
                TreeNode predecessor=findPredecessor(node.left);
                node.val = predecessor.val;
                node.left = deleteRecursive(node.left, node.val);
                return node;
            }  
        }
        return node;
    }
    public TreeNode findPredecessor(TreeNode node){

        while(node.right!=null){
            node = node.right;
        }
        return node;
    }
}