public class SanketProblem1 {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;
        int[] leftSumArray = new int[nums.length];
        int[] rightSumArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftSum = 0;
                leftSumArray[i] = 0;
            } else {
                for (int j = 0; j <= i - 1; j++) {
                    leftSum = nums[j] + leftSum;
                    leftSumArray[i] = leftSum;

                }
                leftSum = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == (nums.length) - 1) {
                rightSum = 0;
                rightSumArray[(nums.length) - 1] = 0;
            } else {
                for (int j = i + 1; j <= nums.length - 1; j++) {
                    rightSum = nums[j] + rightSum;
                    rightSumArray[i] = rightSum;

                }
                rightSum = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(leftSumArray[i] - rightSumArray[i]);
        }
        return answer;

    }
}
