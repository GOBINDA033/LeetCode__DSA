// Leetcode : 1482 Minimum of Days to make m Bouquets
// Time Complexity : O( N log M ) where N is the number of flowers and M is the range of days
// Space Complexity : O(1)

class Solution {

    // Check karta hai ki given day tak m bouquets ban sakte hain ya nahi
    private boolean isPossible(int[] bloomDay, int day, int m, int k) {
        int count = 0; // consecutive flowers
        int bouquets = 0; // total bouquets

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                count++;
            } else {
                bouquets += count / k;
                count = 0;
            }
        }

        bouquets += count / k;
        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        // Agar flowers hi kam hain
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // min aur max bloom day nikaalna
        for (int day : bloomDay) {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }

        int low = min;
        int high = max;
        int ans = -1;

        // Binary Search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
