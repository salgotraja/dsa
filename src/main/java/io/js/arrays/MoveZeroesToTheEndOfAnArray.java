package io.js.arrays;

/**
 *
 */
public class MoveZeroesToTheEndOfAnArray {
   /*
    input arr = [ 42, 2, 0, 3, 4, 0 ]
    expected arr = [ 42, 2, 3, 4, 0, 0 ]
    */

    public int[] moveZerosToEnd(int[] arr) {
        int index = 0;
        for (int n : arr) {
            if (n != 0) {
                arr[index++] = n;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }

        return arr;
    }
}
