package io.js.arrays;

public class ReplaceElements {

    /*  Given an array arr, replace every element in that array with the greatest element among the elements to its right,
        and replace the last element with -1.

        Example 1

        Input: arr = [17,18,5,4,6,1]
        Output: [18,6,6,6,1,-1]
        Explanation:
        - index 0 --> the greatest element to the right of index 0 is index 1 (18).
        - index 1 --> the greatest element to the right of index 1 is index 4 (6).
        - index 2 --> the greatest element to the right of index 2 is index 4 (6).
        - index 3 --> the greatest element to the right of index 3 is index 4 (6).
        - index 4 --> the greatest element to the right of index 4 is index 5 (1).
        - index 5 --> there are no elements to the right of index 5, so we put -1.

        Example 2
        Input: arr = [400]
        Output: [-1]
        Explanation: There are no elements to the right of index 0.

        Constraints:

            1 <= arr.length <= 104
            1 <= arr[i] <= 105
     */

    // Brute force O(n^2) complexity
    public int[] replaceElements(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    // With O(n) complexity
    public int[] replaceElement(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int maxSeenSoFar = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int currentValue = arr[i];
            arr[i] = maxSeenSoFar;
            if(currentValue > maxSeenSoFar) {
                maxSeenSoFar = currentValue;
            }
        }
        return arr;
    }
}
