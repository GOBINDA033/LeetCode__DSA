// 387:The First Unique value in the String
// Time Complexity: O(n)
// Space omplexity: O(1)

class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        // count frequency
        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            freq[ch - 'a']++;
        }

        // find first unique character
        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(freq[ch - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}