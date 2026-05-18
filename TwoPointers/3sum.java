class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        int n = nums.length;

        // Step 2: Fix one element
        for (int i = 0; i < n; i++) {

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            // Step 3: Two pointers
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Triplet found
                if (sum == 0) {

                    ans.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                    ));

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }

                // Sum smaller than 0
                else if (sum < 0) {
                    left++;
                }

                // Sum greater than 0
                else {
                    right--;
                }
            }
        }

        return ans;
    }
}