package Ineuron.ppt.pog;

import java.util.HashSet;

public class AssignmentQ6 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        AssignmentQ6 solution = new AssignmentQ6();
        boolean result = solution.containsDuplicate(nums);

        System.out.println("Output: " + result);
    }
}

