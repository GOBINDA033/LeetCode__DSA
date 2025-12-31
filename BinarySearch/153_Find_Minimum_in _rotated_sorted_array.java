// leetcode: 151 Find Minimum in Rotaed Sorted Array
// Time Complexity O( log n)
// Space complexity O(1)

class Solution {
    public int findMin(int[] nums) {
      int low =0;
      int high =nums.length -1;
      int ans =Integer.MAX_VALUE;

      while( low <= high )
      {
int mid = low + ( high - low )/2;
//left part sorted
if( nums[low] <=nums[mid] )
{
ans= Math.min( ans,nums[low]);
low= mid+1;
}
//right part sorted
else
{
    ans =Math.min(ans, nums[mid] );
    high =mid-1;
}
      }
      return ans;  
    }
}
