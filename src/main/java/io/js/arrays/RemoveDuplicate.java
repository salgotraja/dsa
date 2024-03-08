package io.js.arrays;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int index = 0;

        for (int i = 0; i < length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i];
            }
        }

        nums[index++] = nums[length - 1];

        return index;
    }

    // With O(N) space complexity
    public int removeDuplicatesUpdated(int[] nums) {
        if (nums == null || nums.length==0) {
            return 0;
        }
        int writePointer = 1;
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != nums[readPointer - 1]) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        return writePointer;
    }
}
