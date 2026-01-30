//Leetcode 701: Insert into a Binary Search Tree
// Time Complexity O(h)
// Space Complexity O(h)

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) return new TreeNode(val);

        if (val < root.val)
            root.left = insertIntoBST(root.left, val);
        else
            root.right = insertIntoBST(root.right, val);

        return root;
    }
}