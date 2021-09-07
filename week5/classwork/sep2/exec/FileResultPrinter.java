package week5.classwork.sep2;

import java.io.*;

public class FileResultPrinter implements  ResultPrinter {



    @Override
    public void print(String s) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(
                    new FileOutputStream("C:\\Users\\Nane\\Desktop\\adobe\\hws\\week5\\classwork\\file6.txt")
            );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printWriter.println(s);

        printWriter.close();
    }
}
