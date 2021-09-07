package week5.classwork.sep2;

import java.io.*;

public class MainPrintWriter {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(
                new FileOutputStream("C:\\Users\\Nane\\Desktop\\adobe\\hws\\week5\\classwork\\file5.txt")
        );
//inputing strings
        printWriter.println("line1");
        printWriter.println("line2");

        printWriter.close();

        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(new File("C:\\Users\\Nane\\Desktop\\adobe\\hws\\week5\\classwork\\file5.txt"))
        );

        String line;
//reading line by line from file
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
