package JavaHomework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SharedList {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> sharedList = new ArrayList<>();
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String a = "file "+i;
            FileReader fileReader = new FileReader("C:\\Users\\Nane\\Desktop\\JavaAdobe\\src\\JavaHomework" + i);

            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"thread is working currentely");
                BufferedReader  reader = new BufferedReader(fileReader);
            String s = "";
            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int counter = 0;
            for (int j = 0; j < 10000; j++) {
                if (s.contains("ab")) {
                    counter++;
                }
                try {
                    s = reader.readLine();

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            try {
                reader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            sharedList.add(a+" has " + counter + "lines containing 'ab'-s");

        });
 threadList.add(thread);
            // System.out.println(sharedList);
        }
        for (int i = 0; i < 10; i++) {
            threadList.get(i).start();
            threadList.get(i).join();
        }

        System.out.println(sharedList);
    }
    }
