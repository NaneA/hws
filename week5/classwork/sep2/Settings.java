package week5.classwork.sep2;

import java.io.Serializable;

public class Settings implements Serializable {

    private int width, heigth;

    private String projectName;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Settings(){
        super(); //why
    }


}
