package io.js.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MountainArrayTest {
    private final MountainArray mountainArray = new MountainArray();

    @Test
    public void testValidMountainArray() {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        assertThat(mountainArray.validMountainArray(arr)).isTrue();
    }

    @Test
    public void testInvalidMountainArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertThat(mountainArray.validMountainArray(arr)).isFalse();
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertThat(mountainArray.validMountainArray(arr)).isFalse();
    }

    @Test
    public void testNullArray() {
        int[] arr = null;
        assertThat(mountainArray.validMountainArray(arr)).isFalse();
    }

    @Test
    public void testDescendingArray() {
        int[] arr = {5, 4, 3, 2, 1};
        assertThat(mountainArray.validMountainArray(arr)).isFalse();
    }

    @Test
    public void testAscendingArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertThat(mountainArray.validMountainArray(arr)).isFalse();
    }
}