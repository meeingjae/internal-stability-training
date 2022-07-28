package training.bit;

import java.util.ArrayList;
import java.util.List;

public class BitSubset {
    private String[] source;
    private List<String> gather = new ArrayList<>();

    public BitSubset(String[] source) {
        this.source = source;
    }

    public void gather() {
        for (int i = 0; i < 1 << source.length; i++) {
            StringBuilder builder = new StringBuilder();
            builder.append("{ ");
            for(int j = 0; j < source.length; j++) {
                if((i & 1 << j) != 0) {
                    builder.append(source[j]).append(" ");
                }
            }
            builder.append(" }");
            gather.add(builder.toString());
        }
    }

    public void print() {
        gather.forEach(System.out::println);
    }

    public int getTotalCount() {
        return gather.size();
    }
}
