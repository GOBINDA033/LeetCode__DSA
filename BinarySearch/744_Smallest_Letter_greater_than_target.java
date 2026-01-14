// Leetcode : 744 Smallest Letter Greater Than Target
// Time Complexity O( log n)
// Space Complexity O(1)

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0 , high = letters.length -1;
        while(low <= high)
        {
int mid = low + ( high - low )/2;
if(letters[mid] <= target)
{
low = mid + 1;
}
else
{
    high = mid -1 ;
}
        }
        return letters[low % letters.length]; //if not get greater char
    }
}
