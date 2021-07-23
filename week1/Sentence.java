package com.company;

public class Sentence {

    private String words[]= new String[5];
    private String word;

   public void append(String word){
       boolean bool = false;
       for(int i=0;i<5;i++){
           if(words[i]==null){
               this.words[i] = word;
               bool = true;
               break;
           }
       }
       if(!bool){
           System.out.println("You can't add more than 5 elements");
       }
   }

   public String getValue(){

       String acc = " ";
       for(int i=0;i<5;i++){
           if(words[i]!=null){
              acc+=words[i]+" ";

           }
       }
       return acc;
   }

   public int getCount(){
       for(int i=0;i<5;i++){
           if(words[i]==null){
              return i;

           }
       }
       return 5;
   }

}
