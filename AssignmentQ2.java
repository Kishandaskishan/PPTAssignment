package Ineuron.ppt.pog;

import java.util.Arrays;

public class AssignmentQ2 {
    public int removeElement(int[] nums, int val) {
        int k = 0; // variable to store the count of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        AssignmentQ2 solution = new AssignmentQ2();
        int result = solution.removeElement(nums, val);

        System.out.println("Output: " + result + ", nums = " + Arrays.toString(nums));
    }
}
