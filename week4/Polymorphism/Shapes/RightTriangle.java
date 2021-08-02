package week4.Polymorphism.Shapes;

public class RightTriangle implements Shape {

    int leg1;
    int leg2;

    public RightTriangle(int leg1, int leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public int calculateArea() {
        return leg1*leg2/2;
    }

    @Override
    public String getName() {
        return "Right Angle Triangle";
    }
}
