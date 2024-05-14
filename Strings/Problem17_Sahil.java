// Check if the Sentence Is Pangram

// A pangram is a sentence where every letter of the English alphabet appears at least once.

// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.


// Example 1:

// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true
// Explanation: sentence contains at least one of every letter of the English alphabet.
// Example 2:

// Input: sentence = "leetcode"
// Output: false
 

// Constraints:

// 1 <= sentence.length <= 1000
// sentence consists of lowercase English letters.

public class Problem17_Sahil {
    public boolean checkIfPangram(String sentence) {
        boolean bool = true;
        if(sentence.length() < 26){
            return false;
        }
        StringBuffer s = new StringBuffer();
        for(char c = 'a'; c<='z'; c++){
            s.append(String.valueOf(c));
        }
        // System.out.println(s);
        for(int i=0; i<s.length(); i++){
            if(sentence.indexOf(String.valueOf(s.charAt(i))) == -1){
                return false;
            }
        }
        return bool;
    }
}
