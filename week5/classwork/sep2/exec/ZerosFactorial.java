package week5.classwork.sep2.exec;

public class ZerosFactorial implements Executable {
    private int num;
    @Override
    public void execute() {
        System.out.println(zeroscounter(num));
    }

    @Override
    public ExecutableType getType() {
        return ExecutableType.ZEROSFACTORIAL;
    }

    public ZerosFactorial(int num) {
        this.num = num;
    }

    private int zeroscounter(int n){
        if (n < 0) // Negative Number Edge Case
            return -1;

        // Initialize result
        int count = 0;

        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;

    }
}
