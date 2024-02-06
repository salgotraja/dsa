package io.js.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    private final RemoveElement removeElement = new RemoveElement();

    @Test
    void testRemoveElement() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int expected = 2;
        int actual = removeElement.removeElement(nums, val);
        assertEquals(expected, actual);

        nums = new int[]{0,1,2,2,3,0,4,2};
        val = 2;
        assertEquals(5, removeElement.removeElement(nums, val));
    }

    @Test
    void testRemoveElementWithEmptyArray() {
        int[] nums = {};
        int val = 3;
        int expected = 0;
        int actual = removeElement.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveElementWithNoMatch() {
        int[] nums = {1, 2, 3, 4, 5};
        int val = 6;
        int expected = 5;
        int actual = removeElement.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveElementWithAllMatches() {
        int[] nums = {3, 3, 3, 3};
        int val = 3;
        int expected = 0;
        int actual = removeElement.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveElementWithNullArray() {
        int[] nums = null;
        int val = 3;
        int expected = 0;
        int actual = removeElement.removeElement(nums, val);
        assertEquals(expected, actual);
    }
}