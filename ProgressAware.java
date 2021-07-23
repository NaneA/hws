package com.company.week2;

public class ProgressAware {
    private boolean prog = false;

    public void showProgress()
    {
        prog = true;
        System.out.println("You can see the progress");
    }

    public void hideProgress()
    {
        prog = false;
        System.out.println("Progress is not visible anymore");
    }

    public boolean isPorgressVisible()
    {
        return prog;
    }

    public void ShowProgress(int seconds)
    {
        int cur = 0;
        while(cur < seconds){
            cur++;
            System.out.println((cur*100)/seconds + "%");
        }
    }

}
