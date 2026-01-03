// leetcode: 69 Sqrt(x)
// Binary Search Approach
// Time Complexity O(log n)
// Space Complexity O(1)

class Solution {
    public int mySqrt(int x) {
        int low = 1,high =x;
        int ans =0;

while( low <= high )
{
    long mid  =  low + ( high-low ) / 2;
    long val = mid * mid ;

 if( val <= x )
        {
ans= ( int ) mid;
//Possible Answer
low = ( int ) mid + 1;
        }
        else
        {
         high = ( int ) mid -1 ;   
        }

}
return ans;
       
    }
}