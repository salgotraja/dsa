package io.js.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenNumberCounterTest {
    private EvenNumberCounter finder;

    @BeforeEach
    void setUp() {
        finder = new EvenNumberCounter();
    }

    @Test
    void testFindNumbers() {

        int[] nums1 = new int[]{12, 345, 2, 6, 7896};
        assertEquals(2, finder.findNumbers(nums1));
        int[] nums2 = new int[]{555, 901, 482, 1771};
        assertEquals(1, finder.findNumbers(nums2));
    }

    @Test
    void testWithAllEvenNumberDigits() {
        int[] nums = new int[]{22, 88, 44, 76};
        assertEquals(4, finder.findNumbers(nums));
    }

    @Test
    void testWithAllOddNumberDigits() {
        int[] nums = new int[]{5, 777, 199, 631};
        assertEquals(0, finder.findNumbers(nums));
    }

    @Test
    void testWithSingleElementArray() {
        int[] nums = new int[]{23};
        assertEquals(1, finder.findNumbers(nums));
    }

    @Test
    void testWithLargeArray() {
        int[] nums = new int[500];
        for (int i = 0; i < 500; i++) {
            nums[i] = (int) Math.pow(10, 5);
        }
        assertEquals(500, finder.findNumbers(nums));
    }

    @Test
    void testLowerBound() {
        int[] nums = new int[]{1};
        assertEquals(0, finder.findNumbers(nums));
    }

    @Test
    void testUpperBound() {
        int[] nums = new int[]{100000};
        assertEquals(1, finder.findNumbers(nums));
    }
}