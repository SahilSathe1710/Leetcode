// Remove Trailing Zeros From a String

// Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.

// Example 1:

// Input: num = "51230100"
// Output: "512301"
// Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".
// Example 2:

// Input: num = "123"
// Output: "123"
// Explanation: Integer "123" has no trailing zeros, we return integer "123".
 

// Constraints:

// 1 <= num.length <= 1000
// num consists of only digits.
// num doesn't have any leading zeros.

public class Problem38_Sahil {
    public String removeTrailingZeros(String num) {
        for(int i=num.length()-1; i>=0; i--){
            if(num.charAt(i) != '0'){
                return num.substring(0,i+1);
            }
        }
        // StringBuilder sb = new StringBuilder(num);
        // while(sb.charAt(sb.length()-1) == '0'){
        //     sb = sb.delete(sb.length()-1,sb.length());
        // }
        // return sb.toString();
        return "";
    }
}
