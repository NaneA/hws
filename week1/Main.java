package com.company;

import java.time.Instant;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
       long millis = 1556175797428L; // April 25, 2019 7:03:17.428 UTC
       long old = System.currentTimeMillis();

        Person blah = new Person();
        //Person poghos = new Person();

        blah.setBirtday(millis);
        blah.setName("Blah");
        System.out.println(blah.getName());
        System.out.println(blah.getAge());

        Sentence test = new Sentence();
        test.append("bar1");
        test.append("bar2");
        test.append("bar3");

        System.out.println(test.getCount());
        System.out.println(test.getValue());

    }
}
