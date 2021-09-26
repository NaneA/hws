package JavaHomework.ListAndSet;

public class User implements Comparable {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
