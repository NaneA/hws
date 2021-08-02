package week4.Interfaces.Animals;

public class Frog implements Land, Water{
    @Override
    public void isBreathing() {
        System.out.println("Frog is breathing.");
    }

    @Override
    public void isRunning() {
        System.out.println("Frog is jumping.");
    }

    @Override
    public void isSwimming() {
        System.out.println("Frog is swimming.");
    }
}
