package training.bit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumCase {

    private int[] source;
    private int bitCount;
    private int expectSum;
    private List<int[]> result;

    public SumCase(int[] source, int bitCount, int expectSum) {
        this.source = source;
        this.bitCount = bitCount;
        this.expectSum = expectSum;
        result = new ArrayList<>();
    }

    public void expect() {
        int sum = 0;
        for (int i = 0; i < 1 << source.length; i++) {

            if (Integer.bitCount(i) != bitCount) {
                continue;
            }

            sum = 0;
            int[] sumNum = new int[bitCount];
            int sumNumIdx = 0;
            for (int j = 0; j < source.length; j++) {
                if ((i & 1 << j) != 0) {
                    sum += source[j];
                    sumNum[sumNumIdx] = source[j];
                    sumNumIdx++;
                }
            }
            if (sum == expectSum) {
                result.add(sumNum);
            }
        }
    }

    public List<int[]> getResults() {
        return result;
    }

    public int getResultCount() {
        return result.size();
    }

    public void printResult() {
        result.stream().map(it -> {
            StringBuilder builder = new StringBuilder();
            Arrays.stream(it).forEach(num -> builder.append(num).append(" "));
            return builder.toString();
        })
              .forEach(nums -> System.out.println("nums : " + nums));
    }
}
