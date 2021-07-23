package com.company.week2;

public class CircleProgressAware {

    public void showProgress(int seconds)
    {
        int cur = 0;
        while(cur < seconds){
            cur++;
            System.out.println(" Progress length is"+(cur*360)/seconds);
        }
    }
}
