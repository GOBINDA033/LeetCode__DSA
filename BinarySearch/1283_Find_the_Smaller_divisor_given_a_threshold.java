// leetcode 1283 find the smaller divisor given a threshold
// Time complexity O( N log M) 
// Space Complexity O(1)


class Solution {

    private int sumByD(int[] arr, int div) {
        int sum = 0;
        for (int num : arr) {
            sum += (num + div - 1) / div;
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = 0;

        for (int num : nums) {
            high = Math.max(high, num);
        } 

        while (low <= high) 
        { 
            int mid = low + (high - low) / 2;

            if (sumByD(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}


