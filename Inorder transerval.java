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
    public static void depth(
        TreeNode cur,List<Integer> store){
            if(cur == null) return;
            depth(cur.left,store);
            store.add(cur.val);
            depth(cur.right,store);
        }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> items = new ArrayList<>();
        depth(root,items);
        return items;
    }
}
