package week4.Polymorphism.Shapes;

public class Main {
    public static void main(String[] args) {
        RightTriangle tr = new RightTriangle(2,3);

        System.out.println(tr.getName() + "'s area is ~ " + tr.calculateArea() );
    }


}
