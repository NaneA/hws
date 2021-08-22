package task2;

public class ImmutablePoint implements Point{
    private int x,y;

   public ImmutablePoint(int x,int y){
       this.x = x;
       this.y = y;
   }
   public ImmutablePoint(ImmutablePoint t){
        this.x = t.x ;
        this.y = t.y;
   }

    public Point shiftRight() {
        return new ImmutablePoint(x + 1, y);
    }
    public Point shiftLeft() {
        return new ImmutablePoint(x - 1, y);
    }
    public Point shiftUp() {
        return new ImmutablePoint(x, y + 1);
    }
    public Point shiftDown() {
        return new ImmutablePoint(x, y - 1);
    }
    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
         return this.y;
    }

    @Override
    public String toString(){
        return "ImmutablePoint{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ImmutablePoint check = (ImmutablePoint) o;
        return y == check.y && x == check.x;
    }

    public static void main(String[] args) {
        ImmutablePoint m = new ImmutablePoint(1,1);
        Point o = new ImmutablePoint(1,1);


//        System.out.println(m instanceof ImmutablePoint);
        System.out.println( o.getClass());
        System.out.println(m.equals(o));
        System.out.println(o.equals(m));
    }


}
