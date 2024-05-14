/*
    --> Reverse Words in a String III  <--

    Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"
 

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
 */


public class Problem27_Sanket {
    public String reverseWords(String s) {
        String res = "";
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversed = new StringBuilder(words[i]).reverse();
            String reversedword = reversed.toString();
            res = res + reversedword + " ";
        }

        return res.trim();
    }
    
}