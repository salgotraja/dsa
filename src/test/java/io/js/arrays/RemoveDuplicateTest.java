package io.js.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateTest {
    private final RemoveDuplicate removeDuplicate = new RemoveDuplicate();

    @Test
    void testRemoveDuplicates() {
        int[] nums = {1,1,2};
        int expected = 2;
        int actual = removeDuplicate.removeDuplicates(nums);
        assertEquals(expected, actual);

        nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, removeDuplicate.removeDuplicates(nums));
    }

    @Test
    void testRemoveDuplicatesUpdated() {
        int[] nums = {1,1,2};
        int expected = 2;
        int actual = removeDuplicate.removeDuplicatesUpdated(nums);
        assertEquals(expected, actual);

        nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, removeDuplicate.removeDuplicatesUpdated(nums));
    }

    @Test
    void testRemoveDuplicatesWithEmptyArray() {
        int[] nums = {};
        int expected = 0;
        int actual = removeDuplicate.removeDuplicates(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesUpdatedWithEmptyArray() {
        int[] nums = {};
        int expected = 0;
        int actual = removeDuplicate.removeDuplicatesUpdated(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesWithNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 5;
        int actual = removeDuplicate.removeDuplicates(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesUpdatedWithNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 5;
        int actual = removeDuplicate.removeDuplicatesUpdated(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesWithAllDuplicates() {
        int[] nums = {1, 1, 1, 1, 1};
        int expected = 1;
        int actual = removeDuplicate.removeDuplicates(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesWithLargeArray() {
        int[] nums = new int[1000000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        int expected = nums.length;
        int actual = removeDuplicate.removeDuplicates(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMinArrayLength() {
        int[] nums = {-100};
        int expected = 1;
        int result = removeDuplicate.removeDuplicates(nums);
        assertEquals(expected, result);
        assertArrayEquals(new int[]{-100}, Arrays.copyOf(nums, result));
    }

    @Test
    void testMaxArrayLength() {
        int[] nums = new int[(int) Math.pow(10, 4)];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 100;
        }
        int expected = 1;
        int result = removeDuplicate.removeDuplicates(nums);
        assertEquals(expected, result);
        assertArrayEquals(new int[]{100}, Arrays.copyOf(nums, result));
    }

    @Test
    void testAllUniqueNums() {
        int[] nums = {-100, -50, 0, 50, 100};
        int expected = 5;
        int result = removeDuplicate.removeDuplicates(nums);
        assertEquals(expected, result);
        assertArrayEquals(new int[]{-100, -50, 0, 50, 100}, Arrays.copyOf(nums, result));
    }

    @Test
    void testDuplicateNums() {
        int[] nums = {-100, -100, 0, 0, 100, 100};
        int expected = 3;
        int result = removeDuplicate.removeDuplicates(nums);
        assertEquals(expected, result);
        assertArrayEquals(new int[]{-100, 0, 100}, Arrays.copyOf(nums, result));
    }

    @Test
    void testMaxAndMinArrayValue() {
        int[] nums = {-100, -100, 100, 100};
        int expected = 2;
        int result = removeDuplicate.removeDuplicates(nums);
        assertEquals(expected, result);
        assertArrayEquals(new int[]{-100, 100}, Arrays.copyOf(nums, result));
    }

    @Test
    void testRandomNums() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expected = 5;
        int result = removeDuplicate.removeDuplicates(nums);
        assertEquals(expected, result);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, Arrays.copyOf(nums, result));
    }
}