package io.js.arrays;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        System.out.println(new HeightChecker().heightChecker(new int[] {5,1,2,3,4}));
    }
    public int heightChecker(int[] heights) {
        int count = 0;
        if (null == heights || heights.length == 0) {
            return 0;
        }

        int[] sortedHeights = heights.clone();
        arrSort(sortedHeights);

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i]) {
                count++;
            }
        }
        return count;
    }

    private void arrSort(int[] arr) {
        int tmp;

        for (int i=0; i<arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

    }
}
