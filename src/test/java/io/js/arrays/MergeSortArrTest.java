package io.js.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortArrTest {
    private final MergeSortArr mergeSortArr = new MergeSortArr();

    @Test
    public void test1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        mergeSortArr.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void test2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        mergeSortArr.mergeSort(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void test3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        mergeSortArr.mergeSort(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void test4() {
        int[] nums1 = {-1, 0, 0, 3, 3, 3, 0, 0, 0};
        int m = 6;
        int[] nums2 = {1, 2, 2};
        int n = 3;
        mergeSortArr.mergeSort(nums1, m, nums2, n);
        assertArrayEquals(new int[]{-1, 0, 0, 1, 2, 2, 3, 3, 3}, nums1);
    }

    @Test
    public void test5() {
        int[] nums1 = {4, 0, 0, 0, 0, 0};
        int m = 1;
        int[] nums2 = {1, 2, 3, 5, 6};
        int n = 5;
        mergeSortArr.mergeSort(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    public void testBounds() {
        // Prepare an input with maximum 'm' and 'n' values
        int m = 100;
        int n = 100;
        int[] nums1 = new int[m+n];  // m+n=200
        int[] nums2 = new int[n];  // n=100

        // Populate nums1 with large positive values
        for (int i = 0; i < m; i++) {
            nums1[i] = (int) Math.pow(10, 9) - i;  // 10^9, 10^9 - 1, 10^9 - 2, ...
        }

        // Populate nums2 with large negative values
        for (int i = 0; i < n; i++) {
            nums2[i] = (int) -Math.pow(10, 9) + i;  // -10^9, -10^9 + 1, -10^9 + 2, ...
        }

        mergeSortArr.mergeSort(nums1, m, nums2, n);

        // Check the merged result
        for (int i = 0; i < n; i++) {
            assert(nums1[i] == (int) -Math.pow(10, 9) + i);
        }

        for (int i = n; i < m+n; i++) {
            assert(nums1[i] == (int) Math.pow(10, 9) - (i - n));
        }
    }

}