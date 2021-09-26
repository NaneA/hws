package JavaHomework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class FileGeneratorRunnable {


    public static void main(String[] args) {

       // String[] arr = {"random 1", "random 2", "random 3", "random 4"};
        //for the 3rd problem
        new Thread(() -> {
            FileWriter file = null;
            System.out.println("in the thread");
            for (int i = 0; i < 10; i++) {
                System.out.println("in the first loop");
                try {
                    file = new FileWriter("C:\\Users\\Nane\\Desktop\\JavaAdobe\\src\\JavaHomework" + i);
                } catch (IOException e) {
                    e.printStackTrace();
                }
              //  Thread.yield();
                print(file);
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }).start();

    }

   static void print(FileWriter file) {//synchronized method
        for (int i = 1; i <= 10000; i++) {
           // System.out.println(n * i);
            try {
                String uuid = UUID.randomUUID().toString();

//                int rnd = new Random().nextInt(arr.length);
                file.write(uuid+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}