package io.js.arrays;

public class DuplicateZeros {
    // Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

    /*
        Example 1:

        Input: arr = [1,0,2,3,0,4,5,0]
        Output: [1,0,0,2,3,0,0,4]
        Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
        Example 2:

        Input: arr = [1,2,3]
        Output: [1,2,3]
        Explanation: After calling your function, the input array is modified to: [1,2,3]


        Constraints:

        1 <= arr.length <= 10^4
        0 <= arr[i] <= 9
     */

    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        int i = 0;

        while (i + zeros < n) {
            zeros += arr[i] == 0 ? 1 : 0;
            i++;
        }

        i--;

        while (zeros > 0) {
            int position = i + zeros;

            if (arr[i] == 0) {
                if (position < n) {
                    arr[position] = 0;
                }
                zeros--;
                arr[position - 1] = 0;
            } else if (position < n) {
                arr[position] = arr[i];
            }

            i--;
        }
    }
}
