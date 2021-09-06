package task3.part3;

public class ArmProcessor implements Processor {
    @Override
    public long calculateBinary(long num) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        long startTime = System.currentTimeMillis();
            String temp = "";
            while (num > 0) {
                //  if(System.currentTimeMillis() - startTime >= 1000) {
                temp += num % 2;
                num = num / 2;
                // }
            }
            return Long.parseLong(temp);
        }
    }

