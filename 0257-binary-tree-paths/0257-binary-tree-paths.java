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

    List<String> result;
    StringBuilder path;

    public List<String> binaryTreePaths(TreeNode root) {

        result = new ArrayList<>();
        path = new StringBuilder();

        helper(root);   
        return result;
    }

    void helper(TreeNode root){

        if(root==null){return ;}

        path.append(root.val).append("->");

        if(root.left == null && root.right == null){
            result.add(path.substring(0, path.length()-2));
            return;
        }
        int oldLength = path.length();

        helper(root.left);
        path.setLength(oldLength);
        
        helper(root.right);
        path.setLength(oldLength);
    }
}