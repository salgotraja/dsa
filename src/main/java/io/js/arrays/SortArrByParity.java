package io.js.arrays;


/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * Return any array that satisfies this condition.
 *
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */
public class SortArrByParity {

    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] % 2 > nums[j] % 2) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if (nums[i] % 2 == 0) i++;
            if (nums[j] % 2 == 1) j--;
        }
        return nums;
    }
    public int[] sortArrayByParity1(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] % 2 != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            } else {
                i++;
            }
        }
        return nums;
    }

}
