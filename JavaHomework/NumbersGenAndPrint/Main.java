package JavaHomework.NumbersGenAndPrint;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = sequentialIntegers(5);
        print(integers);

        List<Double> doubles = getRandomDoubles(3);
        print(doubles);
    }

    public static List<Integer> sequentialIntegers(int i) {
              List<Integer> list = new ArrayList<>();
        for (int j = 1; j <= i; j++) {
            list.add(j*2);
        }
        return list;
    }
    public static List<Double> getRandomDoubles(int count) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(Math.random() * 100);
        }
        return list;
    }

    public static void print(List<? extends Number> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
