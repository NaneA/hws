package JavaHomework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TenFilesConcurrentProcessing {

    public static void main(String[] args) throws FileNotFoundException {
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String a = "file"+i;
            FileReader fd = new FileReader("C:\\Users\\Nane\\Desktop\\JavaAdobe\\src\\JavaHomework" + i);
          Thread thread = new Thread(()->{
                 BufferedReader reader = new BufferedReader(fd);
                 String s = "";
              try {
                  s = reader.readLine();
              } catch (IOException e) {
                  e.printStackTrace();
              }
              int counter = 0;
              for (int j = 0; j < 10000; j++) {
                 if(s.contains("ab")){
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
                  fd.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
              System.out.println("file "+ a + " contains "+ counter + " ab's");
              System.out.println(Thread.currentThread().getName());
             });

          list.add(thread);

        }
        for (int i = 0; i <10 ; i++) {
            list.get(i).start();
        }


        }

    }

