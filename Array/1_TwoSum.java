// Leetcode : Two Sum
// Time complexity O(n)
// Space Complexity O(1)
class Solution {
    public int[] twoSumSorted(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[] {};
    }
}