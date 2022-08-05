package training.dfs;

public class NearNode {
    private final int[] nums;
    private boolean[] visit;
    private int[][] node;
    private int[] result;
    private int resultIndex = 0;

    public NearNode(int[] nums) {
        this.nums = nums;
        visit = new boolean[nums.length / 2];
        node = new int[nums.length / 2][nums.length / 2];
        result = new int[nums.length / 2];
    }

    public int[] visit() {
        for (int i = 0; i <= nums.length - 2; i += 2) {
            node[nums[i]][nums[i + 1]] = node[nums[i + 1]][nums[i]] = 1;
        }
        def(0);
        return result;
    }

    private void def(int num) {
        result[resultIndex++] = num;
        visit[num] = true;
        for (int i = 0; i < node[num].length; i++) {
            if (node[num][i] != 0 && !visit[i]) {
                def(i);
            }
        }
    }
}
