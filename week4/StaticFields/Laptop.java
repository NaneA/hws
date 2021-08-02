package week4.StaticFields;

public class Laptop {

    private static int counter1;
    private static int counter2;
    private int value;
    private String brand;

    public Laptop() {
        counter1++;
    }
    protected  Laptop(String brand){
        counter2++;
        this.brand = brand;

    }

    public void print(){
        System.out.println("Counter1: " +counter1 + "Counter2: "+counter2);
    }
    public static int getCountPublic() {
        return counter1;
    }

    public static int getCountProtected() {
        return counter2;
    }

    public void val(int value){
        this.value = value;
    }

}

