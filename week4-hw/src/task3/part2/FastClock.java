package task3.part2;

public class FastClock implements Clock{
    private double time=0;
    private boolean stop;
    @Override
    public void start(){

         long curtime = System.currentTimeMillis();
         while(true){

             if(System.currentTimeMillis() - curtime >=500){
                 this.time+=1;
                 System.out.println(time);
                 curtime = System.currentTimeMillis();

             }

     }

    }


}
