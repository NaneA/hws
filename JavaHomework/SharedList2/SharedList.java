package JavaHomework.SharedList2;

import java.util.ArrayList;
import java.util.List;

public class SharedList {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> sharedList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                for (int j = 0; j < 500; j++) {
                    synchronized (sharedList) {
                        sharedList.add(j);
                    }
                }
            }).start();

        }
        Thread.sleep(3000);
        System.out.println(sharedList.size());
    }


}
