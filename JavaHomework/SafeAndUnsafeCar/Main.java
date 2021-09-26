package JavaHomework.SafeAndUnsafeCar;

public class Main {
    public static void main(String[] args) {
        Car unsafeCar = new UnsafeCar();
        for(int i = 0; i < 6; i++) {
            final int index = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    unsafeCar.add("a"+index);
                }
            }).start();
        }

        Car safeCar = new SafeCar();
        for(int i = 0; i <6; i++) {
            final int index = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    safeCar.add("a"+index);
                }
            }).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        safeCar.printPassangerNames();
        unsafeCar.printPassangerNames();
    }
    }

