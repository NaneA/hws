package task2;

public class Triangle {
   protected final Point first, second, third;
    ;

    public Triangle(Point first,Point second, Point third){
       AssertionUtils.assertNotNull(first);
       AssertionUtils.assertNotNull(second);
       AssertionUtils.assertNotNull(third);

       this.first = first;
       this.second = second;
       this.third = third;
   }

   public Triangle(Triangle t){
       this.first = t.first;
       this.second = t.second;
       this.third = t.third;
   }

   @Override
   public boolean equals(Object o){
       if (o == null || getClass() != o.getClass()) return false;
       Triangle triangle = (Triangle) o;
       return first.equals(triangle.first) &&
               second.equals(triangle.second) &&
               third.equals(triangle.third);
   }

    @Override
    public String toString() {
        return "Triangle " +
                " first: " + first + " second: " + second + " third: "+ third;
    }


    public static void main(String[] args) {
      Point m = new ImmutablePoint(1,2);
      Point n = new ImmutablePoint(1,2);
      Point z = new ImmutablePoint(4,5);
        ColoredTriangle tr = new ColoredTriangle(m, n, z, ColoredTriangle.Color.green);
        tr.temp();

        AssertionUtils.assertNotNull(m);
        Triangle meh = new Triangle(m, n, z);
        System.out.println(tr.equals(meh));
////        System.out.println(meh.equals(tr));

    }
}
