package Ineuron.ppt.pog;

import java.util.HashMap;
import java.util.Map;

public class Assigment1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (complementMap.containsKey(complement)) {
                return new int[] { complementMap.get(complement), i };
            }
            
            complementMap.put(nums[i], i);
        }
        
        return new int[0]; // No solution found
    }
    
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        
        Assigment1 solution = new Assigment1();
        int[] result = solution.twoSum(nums, target);
        
        System.out.println(result[0] + " " + result[1]);
    }
}

