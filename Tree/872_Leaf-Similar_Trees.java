//Leetcode 872: Leaf- Similar Trees
// Time Complexity O(n + m)
// Space Complexity O( n + m)

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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // dono trees ke leaf nodes nikaalo
        getLeaves(root1, list1);
        getLeaves(root2, list2);

        // compare leaf sequences
        return list1.equals(list2);
    }

    void getLeaves(TreeNode root, List<Integer> list) {

        if (root == null)
            return;

        // agar leaf node hai
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }

        getLeaves(root.left, list);
        getLeaves(root.right, list);
    }
}

