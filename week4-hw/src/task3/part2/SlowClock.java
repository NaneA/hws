package task3.part2;

import task3.part2.Clock;

public class SlowClock implements Clock {
    private double time=0;
    private boolean stop;

    @Override
    public void start(){

        long curtime = System.currentTimeMillis();
        while(true){

            if(System.currentTimeMillis() - curtime >=2000){
                this.time+=1;
                System.out.println(time);
                curtime = System.currentTimeMillis();
            }

        }

    }
}
