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

    public class info{
        int diam;
        int ht;
        public info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {

        info res = diameter(root);
        return res.diam;
        
    }
    public info diameter(TreeNode root){
        if(root == null){
            return new info(0,0);
        }
        info linfo = diameter(root.left);
        info rinfo = diameter(root.right);

        //changes lh + rh + 1 -> lh + rh
        int finalDiam = Math.max(linfo.ht+rinfo.ht, Math.max(linfo.diam,rinfo.diam));

        int finalHt = Math.max(linfo.ht,rinfo.ht)+1;

        return new info(finalDiam,finalHt);
    }
}