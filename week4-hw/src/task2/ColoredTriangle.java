package task2;

public class ColoredTriangle extends Triangle{
  //  private Point first,second, third;

    public ColoredTriangle(Point first, Point second, Point third, Color color) {
        super(first, second, third);
        this.color = color;
    }
    enum Color{
        red,
        green,
        blue
    }
    Color color;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Triangle)){
            return false;
        }
        if(o.getClass() == Triangle.class) {
            return o.equals(this);
        }
        ColoredTriangle check = (ColoredTriangle) o;
        return color == check.color;
    }
    public void temp(){
        System.out.println(this.first);
    }

    @Override
    public String toString() {
        return super.toString() + "Triangle color: " + color;
    }
}
