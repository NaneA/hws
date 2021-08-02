package week4.StaticFields;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Laptop laptop1 = new Laptop("Asus");
        Laptop laptop2 = new Laptop();

        System.out.println("Public: "+ Laptop.getCountPublic() + "Private: " + Laptop.getCountProtected() );


    }
}
