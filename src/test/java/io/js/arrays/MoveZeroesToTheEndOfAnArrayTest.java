package io.js.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesToTheEndOfAnArrayTest {

    private final MoveZeroesToTheEndOfAnArray instance = new MoveZeroesToTheEndOfAnArray();

    @Test
    public void testMoveZerosToEnd() {
        int[] arr = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        int[] result = instance.moveZerosToEnd(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMoveZerosToEndWithNoZeroes() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = instance.moveZerosToEnd(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMoveZerosToEndWithMixedNumbersAndZeroes() {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0, 5};
        int[] expected = {1, 2, 3, 4, 5, 0, 0, 0, 0};
        int[] result = instance.moveZerosToEnd(arr);
        assertArrayEquals(expected, result);
    }
}