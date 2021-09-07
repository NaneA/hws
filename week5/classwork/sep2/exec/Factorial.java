package week5.classwork.sep2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Factorial implements Executable{
    private int num;
    private ResultPrinter resultPrinter;

    public int getNum() {
        return num;
    }

    @Override
    public void execute()  {
        this.resultPrinter.print(factorial(num)+"");
    }

    @Override
    public ExecutableType getType() {
        return ExecutableType.FACTORIAL;
    }

    public Factorial(int num, ResultPrinter resultPrinter) {
        this.num = num;
        this.resultPrinter = resultPrinter;
    }

    public Factorial(int num) {
        this.num = num;
    }
    private int factorial(int i){
        if(i==0){
            return 1;
        }
        return i * factorial(i-1);
    }






//
//









}
