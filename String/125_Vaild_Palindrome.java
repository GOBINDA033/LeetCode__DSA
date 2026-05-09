// 125 Valid Palindrome 
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        String newStr = "";

        // remove symbols and spaces
        for(char ch : s.toCharArray()) {

            if(Character.isLetterOrDigit(ch)) {
                newStr += ch;
            }
        }

        int left = 0;
        int right = newStr.length() - 1;

        // palindrome check
        while(left < right) {

            if(newStr.charAt(left) != newStr.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}