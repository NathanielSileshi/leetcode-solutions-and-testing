package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public boolean containsDuplicateHS(int[] nums){
        Set<Integer> sampleHS = new HashSet<>();

        for(int index = 0; index < nums.length; index++){

            if(!sampleHS.add(nums[index])){
                return true;
            }
        }
        return false;
    }
    public boolean containsDuplicateSorting(int[] nums){
        Arrays.sort(nums);

        for(int currIndex = 1; currIndex < nums.length; currIndex++){
            int prevIndex = currIndex - 1;

            if(nums[currIndex] == nums[prevIndex]){
                return true;
            }
        }
        return false;
    }
}
