package week5.classwork.sep2;

public class ZerosFactorial implements Executable{
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

    private int zeroscounter(int num){
        int counter=0;
//        int temp=0;
//        for(int i=0; i<=num ; i++){
//
//            while(i%5==0){
//                System.out.println(num);
//                counter++;
//                i/=5;
//            }
//        }
        return  counter;
    }
}
