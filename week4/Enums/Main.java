package week4.Enums;

public class Main {

    public static void main(String[] args) {
        //1

        Direction.printVals();
        System.out.println(Direction.EAST);
        System.out.println(Direction.EAST.label);

        //2
        System.out.println(Months.getByInd(2));
    }


}
