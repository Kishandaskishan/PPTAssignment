package Ineuron.ppt.pog;

import java.util.Arrays;

public class AssinmentQ4 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // Increment the current digit and return the updated array
                digits[i]++;
                return digits;
            } else {
                // Set the current digit to 0 and continue to the next digit
                digits[i] = 0;
            }
        }
        
        // If all digits are 9, create a new array with one extra digit
        int[] result = new int[n + 1];
        result[0] = 1;
        
        return result;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };

        AssinmentQ4 solution = new AssinmentQ4();
        int[] result = solution.plusOne(digits);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
