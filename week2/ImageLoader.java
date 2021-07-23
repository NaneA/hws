package com.company.week2;

public class ImageLoader extends LineProgressAware {
    public boolean isLoaded = false;

    public ImageLoader(int linelength) {
        super(linelength);
    }

    public void load(){
         if(isLoaded){
             System.out.println("Image is already loaded");
             return;
         }
         showProgress(5);
         this.isLoaded = true;
        System.out.println("Image successfully loaded");

    }

}
