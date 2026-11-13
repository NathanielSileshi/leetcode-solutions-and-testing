package testdata;

public class TwoSumTestCase {
    private final int[] nums;
    private final int target;
    private final int[] expectedResult;

    public TwoSumTestCase(int[] nums, int target, int[] expectedResult){
        this.nums = nums.clone();
        this.target = target;
        this.expectedResult = expectedResult.clone();
    }

    public int[] getNums() {
        return nums.clone();
    }

    public int getTarget() {
        return target;
    }

    public int[] getExpectedResult() {
        return expectedResult.clone();
    }
}
