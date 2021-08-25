package task3;

public class SlowClock implements Clock{
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
