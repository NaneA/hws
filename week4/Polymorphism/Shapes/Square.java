package week4.Polymorphism.Shapes;

public class Square implements Shape{
   int side;
    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side^2;
    }

    @Override
    public String getName() {
        return "Square";
    }
}
