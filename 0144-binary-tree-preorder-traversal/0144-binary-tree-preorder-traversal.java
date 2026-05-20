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
    public List<Integer> preorderTraversal(TreeNode root) {
          List<Integer> ans = new ArrayList<>();

        preorder(root, ans);

        return ans;

    }

    private void preorder(TreeNode node, List<Integer> ans) {

        if (node == null) return;

        // ROOT

        ans.add(node.val);

        // LEFT

        preorder(node.left, ans);

        // RIGHT

        preorder(node.right, ans);

    }

}