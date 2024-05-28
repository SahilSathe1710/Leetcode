// Left and Right Sum Differences

// Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

// answer.length == nums.length.
// answer[i] = |leftSum[i] - rightSum[i]|.
// Where:

// leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
// rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
// Return the array answer.

 

// Example 1:

// Input: nums = [10,4,8,3]
// Output: [15,1,11,22]
// Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
// The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
// Example 2:

// Input: nums = [1]
// Output: [0]
// Explanation: The array leftSum is [0] and the array rightSum is [0].
// The array answer is [|0 - 0|] = [0].
 

// Constraints:

// 1 <= nums.length <= 1000
// 1 <= nums[i] <= 105

import java.util.ArrayList;
import java.util.List;

public class Problem18_Sahil {
   public int[] leftRightDifference(int[] nums) {
        List<Integer> leftSumArr = new ArrayList<Integer>();
        List<Integer> rightSumArr = new ArrayList<Integer>();
        int leftSum = 0;
        int rightSum = 0;
        leftSumArr.add(0);
        for(int i=1; i<nums.length; i++){
            for(int m=0; m<i; m++){
                leftSum += nums[m];
            }
            leftSumArr.add(leftSum);
            leftSum = 0;
        }
        for(int i=0; i<nums.length-1; i++){
            for(int m=i+1; m<nums.length; m++){
                rightSum += nums[m];
            }
            rightSumArr.add(rightSum);
            rightSum = 0;
        }
        rightSumArr.add(0);
        int[] result = new int[nums.length];
        for(int i=0; i<leftSumArr.size(); i++){
            result[i] = Math.abs(leftSumArr.get(i) - rightSumArr.get(i));
        }
        return result;
    } 
}
