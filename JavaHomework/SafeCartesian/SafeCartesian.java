package JavaHomework.SafeCartesian;

public class SafeCartesian {
    private int x;
    private int y;

    public synchronized void set(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public synchronized void setX(int x) {
        this.x = x;
    }

    public synchronized void setY(int y) {
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 100 ; i++) {
//            SafeCartesian safeCartesian = new SafeCartesian();
//            int value = i;
//            new Thread(()->{
//                safeCartesian.set(value,value);
//                System.out.println(safeCartesian.getX() + "   "+ safeCartesian.getY());
//                if(safeCartesian.getX() != safeCartesian.getY()){
//                    System.out.println("blah");
//                }
//
//            }).start();
//        }

        SafeCartesian safeCartesian = new SafeCartesian();
        for (int i = 0; i < 10; i++) {


            new Thread(() -> {
                safeCartesian.setX(10);
                safeCartesian.setY(10);

                safeCartesian.setX(20);
                safeCartesian.setY(20);
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(safeCartesian.getX() + "   "+ safeCartesian.getY());
    }


}
