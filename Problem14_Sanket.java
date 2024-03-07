/*
     -->   Find Numbers with Even Number of Digits  <-


     Given an array nums of integers, return how many of them contain an even number of digits.

     Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105

 */

/**
 * Problem14_Sanket
 */
public class Problem14_Sanket {
    public int findNumbers(int[] nums) {
        int c = 0;
        String str = "";
        for (int i = 0; i < nums.length; i++) {
            str = str + nums[i];
            if (str.length() % 2 == 0) {
                c = c + 1;
            }
            str = "";
        }
        return c;
    }

}
