package io.js.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateZerosTest {

    private DuplicateZeros duplicateZeros;

    @BeforeEach
    void setUp() {
        duplicateZeros = new DuplicateZeros();
    }

    @Test
    public void testDuplicateZeros() {
        int[] input = {1,0,2,3,0,4,5,0};
        int[] expectedOutput = {1,0,0,2,3,0,0,4};
        duplicateZeros.duplicateZeros(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testNoZerosInput() {
        int[] input = {1,2,3};
        int[] expectedOutput = {1,2,3};
        duplicateZeros.duplicateZeros(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testMultipleZerosAtEnd() {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int[] input = {1,2,0,0};
        int[] expectedOutput = {1,2,0,0};
        duplicateZeros.duplicateZeros(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testOnlyZeros() {
        int[] input = {0,0,0,0};
        int[] expectedOutput = {0,0,0,0};
        duplicateZeros.duplicateZeros(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testMaxLengthInput() {
        int[] input = new int[50];
        for(int i = 0; i < 50; i++){
            input[i] = i % 2;
        }
        int[] expectedOutput = new int[50];
        int j = 0;
        for(int i = 0; i < 50 && j < 50; i++,j++){
            expectedOutput[j] = i % 2;
            if(i % 2 == 0 && j < 49){
                expectedOutput[++j] = 0;
            }
        }
        duplicateZeros.duplicateZeros(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testEdgeCase() {
        int[] input = {8,4,5,0,0,0,0,7};
        int[] expectedOutput = {8,4,5,0,0,0,0,0};
        duplicateZeros.duplicateZeros(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testEdgeCaseWithZerosAtEnd() {
        int[] input = {9,9,9,4,8,0,0,3,7,2,0,0,0,0,9,1,0,0,1,1,0,5,6,3,1,6,0,0,2,3,4,7,0,3,9,3,6,5,8,9,1,1,3,2,0,0,7,3,3,0,5,7,0,8,1,9,6,3,0,8,8,8,8,0,0,5,0,0,0,3,7,7,7,7,5,1,0,0,8,0,0};
        int[] expectedOutput = {9,9,9,4,8,0,0,0,0,3,7,2,0,0,0,0,0,0,0,0,9,1,0,0,0,0,1,1,0,0,5,6,3,1,6,0,0,0,0,2,3,4,7,0,0,3,9,3,6,5,8,9,1,1,3,2,0,0,0,0,7,3,3,0,0,5,7,0,0,8,1,9,6,3,0,0,8,8,8,8,0};
        duplicateZeros.duplicateZeros(input);
        assertArrayEquals(expectedOutput, input);
    }
}