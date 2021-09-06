package task3.part3;

public class X8664IntelProcessor implements Processor{
    @Override
    public long calculateBinary(long num) {
        long startTime = System.currentTimeMillis();
        String temp = "";
        while(num>0){
            if(System.currentTimeMillis() - startTime >= 4000) {
                temp += num % 2;
                num = num / 2;
            }
        }
        return Long.parseLong(temp);
    }
}
