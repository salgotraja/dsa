package io.js.arrays;

public class SquareSortedArray {

    /*
       Input: nums = [-4,-1,0,3,10]
       Output: [0,1,9,16,100]
       Explanation: After squaring, the array becomes [16,1,0,9,100].
       After sorting, it becomes [0,1,9,16,100].
     */

    private int[] arrSort(int[] arr) {
        int temp;

        for (int i=0; i<arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] sortedSquares(int[] nums) {
        int [] sqrArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sqrArr[i] = nums[i] * nums[i];
        }

        return arrSort(sqrArr);
    }
}
