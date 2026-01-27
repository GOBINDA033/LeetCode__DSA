// Leetcode : 199 Right Side View
// Time Complexity O(n)
// Space Complexity O(n)


class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        // Final answer list
        List<Integer> answer = new ArrayList<>();

        // Agar tree empty hai to khali list return karo
        if (root == null) return answer;

        // Level Order Traversal ke liye Queue
        Queue<TreeNode> queue = new LinkedList<>();

        // Root node ko queue me daalo
        queue.offer(root);

        // Jab tak queue empty na ho
        while (!queue.isEmpty()) {

            // Current level ke total nodes
            int size = queue.size();

            // Current level ke saare nodes process karna
            for (int i = 0; i < size; i++) {

                // Queue se ek node nikaalo
                TreeNode current = queue.poll();

                // Agar ye current level ka LAST node hai
                // to ye right side se dikhega
                if (i == size - 1) {
                    answer.add(current.val);
                }

                // Agar left child hai to queue me daalo
                if (current.left != null) {
                    queue.offer(current.left);
                }

                // Agar right child hai to queue me daalo
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }

        // Final right side view return karo
        return answer;
    }
}

