// 1832.If the Sentence is Pangram
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean checkIfPangram(String sentence) {

      for( char ch ='a'; ch <='z'; ch++ )
      {
        if( sentence.indexOf(ch) == -1)
          {
return false;
         }   
      } 
       return true;

    }
}