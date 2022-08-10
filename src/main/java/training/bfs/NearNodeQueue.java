package training.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class NearNodeQueue {
    private final int initialNum;
    private Map<Integer, List<Integer>> nodes;
    private int[] result;
    private int resultIndex = 0;

    public NearNodeQueue(int[] nums) {
        this.nodes = new HashMap<>();
        initialNum = nums[0];
        for (int i = 0; i < nums.length; i += 2) {
            if (!nodes.containsKey(nums[i])) {
                nodes.put(nums[i], new ArrayList<>());
            }
            if (!nodes.containsKey(nums[i + 1])) {
                nodes.put(nums[i + 1], new ArrayList<>());
            }
            nodes.get(nums[i]).add(nums[i + 1]);
            nodes.get(nums[i + 1]).add(nums[i]);
        }
    }

    public void visit() {
        result = new int[nodes.keySet().size()];
        Map<Integer, Boolean> visit = new HashMap<>();
        nodes.keySet().forEach(it -> visit.put(it, false));

        Queue<Integer> visitQueue = new LinkedList<>();

        visitQueue.add(initialNum);
        visit.put(initialNum, true);

        while (!visitQueue.isEmpty()) {
            int num = visitQueue.remove();
            visit.put(num, true);
            result[resultIndex++] = num;

            nodes.get(num).stream()
                 .filter(next -> visit.get(next).equals(false) && !visitQueue.contains(next))
                 .forEach(visitQueue::add);
        }
    }

    public int[] getResult() {
        return this.result;
    }
}
