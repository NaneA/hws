package task1;

import java.util.Arrays;

public class UserGroup {
    private User[] usList = new User[10];
    private int counter = 0;


    public void addUser(User temp) {
        if (counter < 10) {
            usList[counter] = temp;
            counter++;
        } else {
            System.out.println("You exceeded the limit");
        }
    }
//

    public UserGroup clone() {
        UserGroup users = new UserGroup();
        for (int i = 0; i < counter; i++) {
            users.addUser(usList[i].copy());
         //   System.out.println(usList[i].copy().getFirstName());
        }
        return users;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "userList=" + Arrays.toString(usList) +
                '}';
    }


//    public void getUsers(){
//        for (int i = 0; i < counter; i++) {
//            System.out.println(usList[i].getFirstName());
//        }
//    }
}

