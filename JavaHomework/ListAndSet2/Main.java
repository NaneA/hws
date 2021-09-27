package JavaHomework.ListAndSet2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(2);
        list.add(3);
        System.out.println(check(list,2));

        Set set = new HashSet();
        set.add(1);
        set.add(4);
        System.out.println(check(set,2));

    }
    public static boolean check(final Collection a, int size){
        if(a.size() != size){
            throw new RuntimeException("Sizes are different");
        }
        return true;
    }
}
