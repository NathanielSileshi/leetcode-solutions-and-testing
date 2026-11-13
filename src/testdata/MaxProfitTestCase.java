package testdata;

public class MaxProfitTestCase {
    private final int[] nums;
    private final int expectedResult;

    public MaxProfitTestCase(int[] nums, int expectedResult){
        this.nums = nums.clone();
        this.expectedResult = expectedResult;
    }

    public int[] getNums() {
        return nums.clone();
    }

    public int getExpectedResult() {
        return expectedResult;
    }
}
