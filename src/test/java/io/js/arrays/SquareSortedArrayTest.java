package io.js.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareSortedArrayTest {

    private SquareSortedArray processor;

    @BeforeEach
    void setUp() {
        processor = new SquareSortedArray();
    }

    @Test
    void sortedSquares() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        int[] result = processor.sortedSquares(nums);
        assertArrayEquals(expected, result);

        int[] nums2 = new int[]{-7,-3,2,3,11};
        assertArrayEquals(new int[]{4,9,9,49,121}, processor.sortedSquares(nums2));
    }

    @Test
    void testWithAllPositiveNumbers() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {1, 4, 9, 16, 25};
        int[] result = processor.sortedSquares(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    void testWithAllNegativeNumbers() {
        int[] nums = {-5, -4, -3, -2, -1};
        int[] expected = {1, 4, 9, 16, 25};
        int[] result = processor.sortedSquares(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    void testLowerBound() {
        int[] nums = new int[]{(int) Math.pow(-10, 4)};
        int[] expected = new int[]{(int) Math.pow(10, 8)};
        int[] result = processor.sortedSquares(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    void testUpperBound() {
        int[] nums = new int[]{(int) Math.pow(10, 4)};
        int[] expected = new int[]{(int) Math.pow(10, 8)};
        int[] result = processor.sortedSquares(nums);
        assertArrayEquals(expected, result);
    }
}