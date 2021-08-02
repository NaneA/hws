package week4.Polymorphism.Shapes;

public class Rectangle implements Shape{

    int width;
    int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public int calculateArea() {
        return width*length;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
