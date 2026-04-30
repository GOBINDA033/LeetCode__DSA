// 1423. Maximum points you can obtain from cards
// Time complexity:O(k)
// Space complexity:O(1)

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        // Sum of first k elements (taking all from left)
        int leftSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }

        int maxSum = leftSum;
        int rightSum = 0;

        // Gradually move selection from left to right
        for (int i = 0; i < k; i++) {
            leftSum -= cardPoints[k - 1 - i];   // remove from left
            rightSum += cardPoints[n - 1 - i];  // add from right
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }

        return maxSum;
    }
}