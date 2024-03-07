package io.js.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceElementsTest {
    private final ReplaceElements replaceElements = new ReplaceElements();

    @Test
    void testReplaceElements() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {5, 5, 5, 5, -1};
        int[] result = replaceElements.replaceElements(arr);

        assertThat(result).isEqualTo(expected);

        arr = new int[]{17, 18, 5, 4, 6, 1};
        expected = new int[] {18,6,6,6,1,-1};
        result = replaceElements.replaceElements(arr);
        assertThat(result).isEqualTo(expected);

        arr = new int[] {500, 400};
        expected = new int[]{400, -1};
        result = replaceElements.replaceElement(arr);
        assertThat(result).isEqualTo(expected);
     }

    @Test
    void testReplaceElement() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {5, 5, 5, 5, -1};
        int[] result = replaceElements.replaceElement(arr);
        assertThat(result).isEqualTo(expected);

        arr = new int[]{17, 18, 5, 4, 6, 1};
        expected = new int[] {18,6,6,6,1,-1};
        result = replaceElements.replaceElements(arr);
        assertThat(result).isEqualTo(expected);

        arr = new int[] {400};
        expected = new int[] {-1};
        result = replaceElements.replaceElement(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testDecreasingOrder () {
        int [] arr = new int[]{5, 4, 3, 2, 1};
        int [] expected = new int[]{4, 3, 2, 1, -1};
        int [] result = replaceElements.replaceElement(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testIncreasingOrder() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {5, 5, 5, 5, -1};
        int[] result = replaceElements.replaceElement(arr);
        assertThat(result).isEqualTo(expected);
    }
}