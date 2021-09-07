package week5.classwork.sep2;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
//        Factorial blah = new Factorial(10);
//        System.out.println(blah.getNum());
//        blah.execute();
//
//        ZerosFactorial blah2 = new ZerosFactorial(10);
//        blah2.execute();
        ResultPrinter resultPrinter;
        Scanner myObj = new Scanner(System.in);
        int bool = myObj.nextInt();
        switch (bool){
            case 1:
                resultPrinter = new FileResultPrinter();
                break;
            default:
                resultPrinter = new SystemResultPrinter();
        }


        int value = myObj.nextInt();
        System.out.println(value);
        switch(value) {
            case 1:
                new Factorial(10, resultPrinter).execute();
                break;
            case 2:
                new ZerosFactorial(10).execute();
                break;
            default:
                new Sum(10).execute();
                // code block
        }
    }


}
