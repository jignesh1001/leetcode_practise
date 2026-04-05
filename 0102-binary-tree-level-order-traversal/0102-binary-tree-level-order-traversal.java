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
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> res = new ArrayList<>();

      if(root == null){
        return res;
      }
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       q.add(null);
       List<Integer> ls = new ArrayList<>();

       while(!q.isEmpty()){
               TreeNode currNode = q.remove();
               if(currNode == null){
                //  System.out.println();
                res.add(ls);
                 if(q.isEmpty()){
                    break;
                 }
                 ls =new ArrayList<>();
                 q.add(null);
               }
               else{
                // System.out.print(currNode.data+" ");
                ls.add(currNode.val);
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
               }
            }
        return res;   

    }
}