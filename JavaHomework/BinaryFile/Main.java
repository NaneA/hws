package JavaHomework.BinaryFile;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("C:\\Users\\Nane\\Desktop\\JavaAdobe\\src\\JavaHomework" + 11);

        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        System.out.println(number1 + " "+ number2);

        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(number1);
        printWriter.println(number2);
        printWriter.close();

        Thread.sleep(2000);
        FileReader fileReader = new FileReader("C:\\Users\\Nane\\Desktop\\JavaAdobe\\src\\JavaHomework" + 11);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        int sum = num1+num2;

        System.out.println(sum);

        FileWriter fileWriter = new FileWriter(file,true);
        fileWriter.write(Integer.toBinaryString(sum));
        fileWriter.close();


    }
}
