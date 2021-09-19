package Sep18Hw;

import java.io.*;
import java.util.UUID;

public class FileGeneratorRunnable {


    public static void main(String[] args) {


        new Thread(() -> {
            FileWriter file = null;
            System.out.println("in the thread");
            for (int i = 0; i < 10; i++) {
                System.out.println("in the first loop");
                try {
                    file = new FileWriter("C:\\Users\\Nane\\Desktop\\adobe\\hws\\Sep18Hw\\" + i);
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
                file.write(i+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}