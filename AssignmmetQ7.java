package Ineuron.ppt.pog;

import java.util.Arrays;

public class AssignmmetQ7 {
    public void moveZeroes(int[] nums) {
        int left = 0; // Pointer for non-zero elements
        
        // Move all non-zero elements to the left
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }
        
        // Fill the remaining elements with zeros
        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        AssignmmetQ7 solution = new AssignmmetQ7();
        solution.moveZeroes(nums);

        System.out.println("Output: " + Arrays.toString(nums));
    }
}
