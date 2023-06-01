package Ineuron.ppt.pog;

import java.util.Arrays;

public class AssignmentQ8 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int xor = 0;
        
        // XOR all numbers in nums with all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor ^= i;
            xor ^= nums[i - 1];
        }
        
        // Find the rightmost set bit in xor
        int rightmostSetBit = xor & -xor;
        
        int num1 = 0;
        int num2 = 0;
        
        // Divide the numbers in nums into two groups based on the rightmost set bit
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        
        // Divide the numbers from 1 to n into two groups based on the rightmost set bit
        for (int i = 1; i <= n; i++) {
            if ((i & rightmostSetBit) != 0) {
                num1 ^= i;
            } else {
                num2 ^= i;
            }
        }
        
        // Find which number is missing
        for (int num : nums) {
            if (num == num1) {
                return new int[] {num1, num2};
            }
        }
        
        return new int[] {num2, num1};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        AssignmentQ8 solution = new AssignmentQ8();
        int[] result = solution.findErrorNums(nums);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
