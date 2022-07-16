package training.recursive;

public class Factorial {
    private int num;

    public Factorial(int num) {
        this.num = num;
    }

    public int execute() {
        return execute(this.num);
    }

    private int execute(int num) {
        if (num == 0) {
            return 1;
        }
        return num * execute(num - 1);
    }
}
