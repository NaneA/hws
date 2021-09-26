package JavaHomework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilesAnalyzerRunnable {


    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader;
        List<FileReader> list = new ArrayList<>();
        String[] arr = {"random 1", "random 2", "random 3", "random 4"};
        for (int i = 0; i <10 ; i++) {
            fileReader = new FileReader("C:\\Users\\Nane\\Desktop\\adobe\\hws\\Sep18Hw\\" + i);
            list.add(fileReader);
        }
      new Thread(()->{
          for (int i = 0; i < 10; i++) {
              BufferedReader bufferedReader = new BufferedReader(list.get(i));
              String s="";
              try {
                 s = bufferedReader.readLine();
              } catch (IOException e) {
                  e.printStackTrace();
              }
              for (int j = 0; j < arr.length ; j++) {
                  if(s.contains(arr[j])){
                      System.out.println("file "+i+" contains "+arr[j]);
                  }
              }
              try {
                  bufferedReader.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
              System.out.println(Thread.currentThread().getName());
          }

      }).run();
    }
}
