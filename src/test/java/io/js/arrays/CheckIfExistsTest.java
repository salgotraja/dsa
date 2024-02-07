package io.js.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfExistsTest {
    private final CheckIfExists checkIfExists = new CheckIfExists();

    @Test
    void testCheckIfExist() {
        int[] arr1 = {10, 2, 5, 3};
        int[] arr2 = {3, 1, 7, 11};

        boolean result1 = checkIfExists.checkIfExist(arr1);
        boolean result2 = checkIfExists.checkIfExist(arr2);

        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    void testCheckIfExist_EmptyArray() {
        int[] arr = {};
        boolean result = checkIfExists.checkIfExist(arr);
        assertFalse(result);
    }

    @Test
    void testCheckIfExist_SingleElementArray() {
        int[] arr = {0};
        boolean result = checkIfExists.checkIfExist(arr);
        assertFalse(result);
    }

    @Test
    void testCheckIfExist_NullArray() {
        int[] arr = null;
        boolean result = checkIfExists.checkIfExist(arr);
        assertFalse(result);
    }

    @Test
    void testCheckIfExist_DuplicateElements() {
        int[] arr = {2, 2, 4, 8};
        boolean result = checkIfExists.checkIfExist(arr);
        assertTrue(result);
    }

    @Test
    void testCheckIfExist_NegativeElements() {
        int[] arr = {-2, 4, -8, 0};
        boolean result = checkIfExists.checkIfExist(arr);
        assertFalse(result);
    }

    @Test
    void testMinArrayLength() {
        int[] arr = {-1000, 1000};
        boolean result = checkIfExists.checkIfExist(arr);
        assertFalse(result);
    }

    @Test
    void testMaxArrayLength() {
        int[] arr = new int[500];
        Arrays.fill(arr, 1000);
        boolean result = checkIfExists.checkIfExist(arr);
        assertFalse(result);
    }

    @Test
    void testArrayWithNegativeAndPositiveElements() {
        int[] arr = {-1000, -500, 0, 500, 1000};
        boolean result = checkIfExists.checkIfExist(arr);
        assertTrue(result);
    }

    @Test
    void testArrayWithOneNegativeAndOnePositiveDuplicate() {
        int[] arr = {-500, 500, 1000, 125, -1000, 250};
        boolean result = checkIfExists.checkIfExist(arr);
        assertTrue(result);
    }

    @Test
    void testArrayWithZeros() {
        int[] arr = {0, 0, -1000, 1000};
        boolean result = checkIfExists.checkIfExist(arr);
        assertTrue(result);
    }
}