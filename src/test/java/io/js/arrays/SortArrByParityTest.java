package io.js.arrays;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class SortArrByParityTest {
    private final SortArrByParity processor = new SortArrByParity();

    @Test
    void sortArrByParity() {
        int [] nums = {3,1,2,4};
        int [] expectedNums = {4, 2, 1, 3};
        int [] result = processor.sortArrayByParity(nums);

        assertThat(result).isEqualTo(expectedNums);
    }

    @Test
    void sortArrByParity_When_SingleNumber() {
        int [] arr = {0};
        int [] expected = {0};
        assertThat(expected).isEqualTo(processor.sortArrayByParity(arr));
    }

    @Test
    void testAllOddNumbers() {
        int[] arr = {1, 3, 5, 7};
        int[] expected = {1, 3, 5, 7};
        int[] result = processor.sortArrayByParity(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testAllEvenNumbers() {
        int[] arr = {2, 4, 6, 8};
        int[] expected = {2, 4, 6, 8};
        int[] result = processor.sortArrayByParity(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testZeros() {
        int[] arr = {0, 1, 0};
        int[] expected = {0, 0, 1};
        int[] result = processor.sortArrayByParity(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testLargeArray() {
        int[] nums = new Random().ints(5000, 0, 5001).toArray();
        int[] result = processor.sortArrayByParity(nums);
        boolean foundOdd = false;
        for (int num : result) {
            if (foundOdd && num % 2 == 0) {
                assertThat(false).withFailMessage("Even number found after odd number").isTrue();
            }
            if (num % 2 != 0) {
                foundOdd = true;
            }
        }
        assertThat(true).isTrue();
    }
}