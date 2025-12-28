//Leetcode: 34 Find First and last position of element in sorted Array
// Time Complexity O(log n)
// Space Complexity O(1)
class Solution {

    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);
        int last = upperBound(nums, target) - 1;

        // If target is not present
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{first, last};
    }

    // first index where nums[i] >= target
    private int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // first index where nums[i] > target
    private int upperBound(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
