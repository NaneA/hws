package com.company.week3;

public class LinkedIntBuffer extends IntBuffer {
    LinkedIntBuffer next;
    private int counter;


    public LinkedIntBuffer getNext(){
        return next;
    }

    public void setNext(LinkedIntBuffer next){
        this.next = next;
        this.counter++;
    }
   @Override
   public String toString(){
       LinkedIntBuffer cur = next;

       for(int i = 0; i<counter; i++)
       {
           System.out.println(cur.getValue() + "->");
           cur = cur.getNext();
       }

        return "";
   }
}
