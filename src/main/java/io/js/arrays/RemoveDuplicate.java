package io.js.arrays;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int index = 0;

        for(int i=0; i < length - 1; i++) {
            if(nums[i] != nums[i + 1]) {
                nums[index++] = nums[i];
            }
        }

         nums[index++] = nums[length - 1];

        return index;
    }

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("\nTotal: " + new RemoveDuplicate().removeDuplicates(nums));

    }
}
