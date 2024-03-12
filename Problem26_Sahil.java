// Unique Morse Code Words

// International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

// 'a' maps to ".-",
// 'b' maps to "-...",
// 'c' maps to "-.-.", and so on.
// For convenience, the full table for the 26 letters of the English alphabet is given below:

// [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
// Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

// For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
// Return the number of different transformations among all words we have.

// Example 1:

// Input: words = ["gin","zen","gig","msg"]
// Output: 2
// Explanation: The transformation of each word is:
// "gin" -> "--...-."
// "zen" -> "--...-."
// "gig" -> "--...--."
// "msg" -> "--...--."
// There are 2 different transformations: "--...-." and "--...--.".
// Example 2:

// Input: words = ["a"]
// Output: 1
 

// Constraints:

// 1 <= words.length <= 100
// 1 <= words[i].length <= 12
// words[i] consists of lowercase English letters.

import java.util.ArrayList;
import java.util.List;

public class Problem26_Sahil {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        List<Character> letters = new ArrayList<Character>();
        for(char c = 'a'; c<='z'; c++){
           letters.add(c);
        }
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                for(int k=0; k<letters.size(); k++){
                    if(words[i].charAt(j) == letters.get(k)){
                        words[i] = words[i].replace(String.valueOf(words[i].charAt(j)), code[k]);
                    }
                }
            }
        }
        if(words.length == 1){
            return 1;
        }
        int count = words.length;
        for(int i=0; i<words.length; i++){
            for(int j = i+1; j<words.length; j++){
                if(words[i].equals(words[j])){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
