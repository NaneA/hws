package com.company;

public class Person {

    long birthday;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirtday(long birthday) throws Exception{
        if(this.birthday == 0) {
            this.birthday = birthday;
        }
        else{
            throw new Exception("You can only input once");
        }
    }
    public long getAge(){
        long cur = System.currentTimeMillis();
        long age =   (long)(cur-birthday)/(1000*60*60*24)/365;
        return age;

    }

}
