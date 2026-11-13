package problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] TwoSum(int[] nums, int target){
        // Create a HashMap object
        Map<Integer,Integer> sampleHM = new HashMap<>();

        for(int index = 0; index < nums.length; index++){
            // Calculates (target) - (current index's element value)
            int difference = target - nums[index];
            // Checks if the difference is in the HashMap
            if(sampleHM.containsKey(difference) && index != sampleHM.get(difference)){
                // If so we can return since pair for sum is found
                return new int[]{sampleHM.get(difference),index};
            }
            // Fill in the HashMap object with
            // Key = array value
            // Value = array index
            sampleHM.put(nums[index],index);
        }
        return null;
    }
}
