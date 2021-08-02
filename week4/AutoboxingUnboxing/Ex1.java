package week4.AutoboxingUnboxing;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Ex1 {

    public static void main(String[] args) {
        //1.1
        Integer temp = new Integer(rand(-500,-1));
        int unbox = -1*temp;
        System.out.println(unbox);

        //2

        List<Double> myList = new ArrayList();
        myList.add(Math.PI);
        myList.add(2.0);
        double autobox = myList.get(0);
        System.out.println(autobox);


    }


    public static int rand(int min, int max) {
        Random random = new Random();

        return random.nextInt(max - min) + min;

    }

}
