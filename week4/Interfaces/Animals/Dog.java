package week4.Interfaces.Animals;

public class Dog implements Land {
    @Override
    public void isBreathing() {
        System.out.println("Frog is breathing.");
    }

    @Override
    public void isRunning() {
        System.out.println("Frog is jumping.");
    }
    
}
