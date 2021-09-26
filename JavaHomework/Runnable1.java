package JavaHomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Runnable1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Nane\\Desktop\\adobe\\hws\\Sep18Hw\\file");
        new Thread(new Runnable() {
            PrintWriter printWriter = new PrintWriter(file);
            @Override
            public void run() {
                for (int i = 0; i <10000 ; i++) {
                    printWriter.println(" " + i);
                }
                printWriter.close();
            }
        }).run();
    }
}
