// Leetcode : 94 Inorder Traversal
// Time Complexity O(n)
// Space Complexity O(n)

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
dfs(root, ans);
return ans;
    }
private void dfs(TreeNode root, List< Integer> ans)
{
    if(root == null) return;
    //left
    dfs( root.left ,ans);
    // root
    ans.add(root.val);
    // right
    dfs(root.right,ans);
}
    }
