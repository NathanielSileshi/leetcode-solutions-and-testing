package testdata;

public class DuplicateTestCase {
    private final int[] nums;
    private final boolean expectedResult;

    public DuplicateTestCase(int[] nums, boolean expectedResult){
        this.nums = nums.clone();
        this.expectedResult = expectedResult;
    }

    public int[] getNums() {
        return nums.clone();
    }
    public boolean getExpectedResult(){
        return expectedResult;
    }
}
