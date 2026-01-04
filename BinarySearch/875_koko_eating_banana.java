// Leetcode :875 Koko Eating Bananas
// Time Complexity O( log n )
// Space Complexity O(1)


class Solution {
    // Helper: check if Koko can eat all bananas at speed k within h hours
    private boolean canEat(int[] piles, int h, int k) {
        long hours = 0;

        for (int p : piles) {
            // ceil(p / k)
            hours += (p + k - 1) / k;
        }

        return hours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        // find max pile
        for (int p : piles) {
            high = Math.max(high, p);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canEat(piles, h, mid)) {
                ans = mid;
                high = mid - 1; // try smaller speed
            } else {
                low = mid + 1; // need faster speed
            }
        }

        return ans;
    }
}

