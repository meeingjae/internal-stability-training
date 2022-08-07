package training.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class NearNodeStack {
    private int initialLength;
    private int[] nums;
    private Map<Integer, List<Integer>> nodes;
    private int[] result;
    private int resultIndex = 0;

    public NearNodeStack(int[] nums) {
        initialLength = nums.length / 2;
        this.nums = nums;
        nodes = new HashMap<>();
        result = new int[initialLength];
    }

    public int[] visitNodes() {
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
        visit(nodes.keySet().stream().findFirst().orElse(0));   // 최초 노드 값으로 요청
        return result;
    }

    private void visit(int num) {
        Map<Integer, Boolean> visit = new HashMap<>(); //방문 여부
        Arrays.stream(nums)
              .distinct()
              .forEach(it -> visit.put(it, false)); //모든 노드 미방문으로 초기화

        Stack<Integer> visitStack = new Stack<>();
        visitStack.push(num);   // 최초 Node 값 Push

        while (!visitStack.isEmpty()) {
            int currentNum = visitStack.pop();
            if (visit.get(currentNum).equals(true)) {
                continue;
            }
            visit.put(currentNum, true);
            result[resultIndex++] = currentNum;
            nodes.get(currentNum).stream()
                 .filter(it -> visit.get(it).equals(false))
                 .forEach(visitStack::push);
        }
    }
}