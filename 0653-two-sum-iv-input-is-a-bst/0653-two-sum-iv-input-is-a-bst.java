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

 import java.util.HashSet;
class Solution {

    HashSet<Integer> set;
    public boolean findTarget(TreeNode root, int k) {

        if(root == null){
            return false;
        }
        set = new HashSet<>();
        
        return traverse(root, k);
    }

    boolean traverse(TreeNode root, int k){

        if(root == null){
            return false;
        }
        if(set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        if(traverse(root.left, k)){
            return true;
        }
        if(traverse(root.right, k)){
            return true;
        }
        return false;
    }
}