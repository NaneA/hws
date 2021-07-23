package com.company.week2;

public class LineProgressAware extends ProgressAware{

    public int linelength;

    public LineProgressAware(int linelength) {
        if(linelength<0){
            new RuntimeException("Wrong Input");
        }
        this.linelength = linelength;
    }

    public void showProgress(int seconds)
    {
        int cur = 0;
        while(cur < seconds){
            cur++;
            System.out.println("Line width is:"+linelength +" Progress length is"+(cur*linelength)/seconds);
        }
    }



}
