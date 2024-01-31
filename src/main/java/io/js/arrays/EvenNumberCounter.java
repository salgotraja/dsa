package io.js.arrays;

public class EvenNumberCounter {

    private boolean hasEvenDigits(int num) {
        int digitCount = 0;
        while (num != 0) {
            digitCount++;
            num /= 10;
        }

        return (digitCount & 1) == 0;
    }

    public int findNumbers(int[] nums) {
        int evenDigitCount = 0;

        for (int num : nums) {
            if (hasEvenDigits(num)) {
                evenDigitCount++;
            }
        }

        return evenDigitCount;
    }

    // Approach 2; Convert numbers to string
    public int findNumbersSol2(int[] nums) {
        int evenDigitCount = 0;

        for (int num : nums) {
            int length = String.valueOf(num).length();
            if (length % 2 == 0)
                evenDigitCount++;
        }

        return evenDigitCount;
    }

    // Approach 3; Given a positive integer x, the number of digits in x is ⌊log10x⌋+1
    public int findNumbersSol3(int[] nums) {
        int evenDigitCount = 0;

        for (int num : nums) {
            int digitCount = (int) Math.floor(Math.log10(num)) + 1;
            if (digitCount % 2 == 0)
                evenDigitCount++;
        }

        return evenDigitCount;
    }
}
