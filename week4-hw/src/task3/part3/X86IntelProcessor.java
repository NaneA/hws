package task3.part3;

import java.util.ArrayList;

public class X86IntelProcessor implements  Processor{

    @Override
    public long calculateBinary(long num) {
        long startTime = System.currentTimeMillis();
        String temp = "";
        while(num>0){
            if(System.currentTimeMillis() - startTime >= 2000) {
                temp += num % 2;
                num = num / 2;
            }
        }
        return Long.parseLong(temp);
    }


}
