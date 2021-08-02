package week4.Polymorphism.Staff;

public class Main {
    public static void main(String[] args) {
        Staff des = new Designer();
        des.work();
        Staff hr = new HR();
        hr.work();

    }
}
