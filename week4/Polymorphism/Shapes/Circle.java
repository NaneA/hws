package week4.Polymorphism.Shapes;

import week4.Polymorphism.Staff.Main;

public class Circle implements Shape{
    int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    @Override
    public int calculateArea() {
        return (int) Math.PI * rad^2 ;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}

