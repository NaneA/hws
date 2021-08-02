package week4.Enums;

public enum Direction {
    EAST("e"),
    WEST ("w"),
    SOUTH("s"),
    NORTH ("n");
    public final String label;

    private Direction (String label) {
        this.label = label;
    }

    public static void printVals(){
        System.out.println(java.util.Arrays.asList(Direction.values()));

    }

}


