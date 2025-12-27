//Leetcode: 278 First Bad Version
/* The isBadVersion API is defined in the parent class VersionControl.
 boolean isBadVersion(int version); */

      //Time Complexity O(log n)
// Space Complexity O(1)

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1;
        int high=n;
        int ans= n;
        while( low <= high )
        {
int mid = low + ( high - low ) / 2;
if(isBadVersion(mid))
{
ans = mid;
high = mid -1;
}
else
{
    low = mid +1;
}
}
    return ans;    
    }
}