// leetcode 144 : Binary Tree Preorder Traversal
// Time cComplexity O(n)
// Space Complexity O(n) recursive stack space
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
       List<Integer>ans=new ArrayList<>(); 
       dfs(root,ans);
       return ans;
    }
       private void dfs(TreeNode root, List<Integer> ans)
       {
       
        if( root == null)return;
       
        //root
        ans.add(root.val);
        //left
        dfs(root.left ,ans);
        //right
        dfs(root.right, ans);
       
    }
}
