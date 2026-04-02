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
    // dfs tree traversal
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        return preOrder(root,val);

    }
    public boolean preOrder(TreeNode root, int val){
        if(root == null){
            return true;
        }
        if(root.val != val){
            return false;
        }
        
        return preOrder(root.left,val) && preOrder(root.right,val) ;
    }
}