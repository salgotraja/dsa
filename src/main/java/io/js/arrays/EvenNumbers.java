package io.js.arrays;

public class EvenNumbers {

    public int findNumbers(int[] nums) {
        int even = 0;

        boolean isEven;

        for (int num : nums) {
            isEven = hasEvenDigits(num);
            if (isEven) {
                even++;
            }
        }

        return even;
    }

    private boolean hasEvenDigits(int num) {
        int digitCount = 0;
        while (num > 0) {
            digitCount = digitCount + 1;
            num = num / 10;
        }

        return digitCount % 2 == 0;
    }
}
