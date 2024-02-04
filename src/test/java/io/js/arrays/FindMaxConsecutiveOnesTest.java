package io.js.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMaxConsecutiveOnesTest {
    private final FindMaxConsecutiveOnes findMaxConsecutiveOnes = new FindMaxConsecutiveOnes();

    @Test
    void testFindMaxConsecutiveOnes() {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        assertEquals(3, findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    void testWithAllZeros() {
        int[] nums = new int[]{0, 0, 0, 0, 0, 0};
        assertEquals(0, findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    void testWithAllOnes() {
        int[] nums = new int[]{1, 1, 1, 1, 1, 1};
        assertEquals(6, findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    void testWithSingleElementArray() {
        int[] nums = new int[]{1};
        assertEquals(1, findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    void testWithLargeArray() {
        int[] nums = new int[(int) Math.pow(10, 5)];
        for (int i = 0; i < 50; i++) {
            nums[i] = 1;
        }
        assertEquals(50, findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    void testWithLargestConsecutiveOnesInLargeArray() {
        int[] nums = new int[(int) Math.pow(10, 5)];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1;
        }
        assertEquals(nums.length, findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    void testWithNoOnesInLargeArray() {
        int[] nums = new int[(int) Math.pow(10, 5)];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }
        assertEquals(0, findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }
}