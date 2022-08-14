package training.exhaustive;

public class MaxPickedNumber {

    private final static int ZERO_INDEX = 0;
    private int[] nums;
    private int pickSize;
    private int result = 0;

    public MaxPickedNumber(int[] nums, int pickSize) {
        this.nums = nums;
        this.pickSize = pickSize;
    }

    public int max() {

        return permutation(ZERO_INDEX, ZERO_INDEX, ZERO_INDEX);
    }

    private int permutation(int pick, int used, int val) {
        if (pick == pickSize) {
            return val;
        }

        for (int i = 0; i < nums.length; i++) {
            if ((used & 1 << i) != 0) {
                continue;
            }
            result = Math.max(result, permutation(pick + 1, used | 1 << i, (val * 10 + nums[i])));
        }
        return result;
    }
}
