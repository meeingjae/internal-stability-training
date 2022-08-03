package training.exhaustive;

public class MaxSumNumber {
    private final int START_INDEX = 0;
    private final int[] nums;
    private final int pickSize;

    public MaxSumNumber(int[] nums, int pickSize) {
        this.nums = nums;
        this.pickSize = pickSize;
    }

    public int max() {
        return calculate(START_INDEX, START_INDEX, START_INDEX);
    }

    private int calculate(int pos, int cnt, int val) {
        if (cnt == pickSize) {
            return val;
        }
        if (pos == nums.length) {
            return -1;
        }
        int result = 0;

        result = Math.max(result, calculate(pos + 1, cnt + 1, val + nums[pos]));
        result = Math.max(result, calculate(pos + 1, cnt, val));
        return result;
    }
}
