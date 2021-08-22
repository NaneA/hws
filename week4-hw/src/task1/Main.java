package task1;

public class Main {
    public static void main(String[] args) throws Exception {
        User boghos = new User("Boghos", "Petrosyan", "bogh", "bpog@gmail.com");
        User boghos2 = new User(boghos);


        User user1 = new User("a", "b", "c", "d");



        UserGroup users = new UserGroup();
        users.addUser(user1);
        users.addUser(boghos);
        users.addUser(boghos2);
      //  users.getUsers();

        UserGroup clonedUsers = users.clone();
//        System.out.println(user1);
//
//        System.out.println(users);
       System.out.println(clonedUsers);

    }
}
