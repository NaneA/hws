package week5.classwork.sep2;

public class Sum implements Executable{
    private int num;
    @Override
    public void execute() {
        System.out.println(sum(num));
    }

    @Override
    public ExecutableType getType() {
        return ExecutableType.SUM;
    }

    public Sum(int num) {
        this.num = num;
    }

    private int sum(int i){
        int temp = 0;
        for (int j = 0; j <= i; j++) {
            temp+=j;
        }
        return temp;
    }
}
