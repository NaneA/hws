package JavaHomework.CustomSafeListImplementation;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        UnsafeSimpleList<String> unsafeSimpleList = new UnsafeSimpleList<>();
        SafeSimpleList<String> safeSimpleList = new SafeSimpleList<>();

        for (int i = 0; i < 20; i++) {
            int value = i;

            new Thread(new Runnable() {
                @Override
                public void run() {
                    unsafeSimpleList.add(value+"");
                    System.out.println(unsafeSimpleList.get(value));

                }
            }).start();

    }
        for (int i = 0; i < 20; i++) {
            int value = i;

            new Thread(new Runnable() {

                @Override
                public void run() {
                    safeSimpleList.add(value+"");
                    System.out.println(safeSimpleList.get(value));

                }
            }).start();
            //Thread.currentThread().join();
        }
         Thread.sleep(1000);
        System.out.println(safeSimpleList.getSize()+"size safe");
        System.out.println(unsafeSimpleList.getSize()+"size unsafe");
    }
}
