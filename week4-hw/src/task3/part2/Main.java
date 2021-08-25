package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        if(val == 1){
            new FastClock().start();
        }
        else if(val == 2){
            new SlowClock().start();
        }


    }
}
