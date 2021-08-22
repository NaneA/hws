package task1;

public class User{


    public String getFirstName() {
        return firstName;
    }

    private String  firstName , lastName , username , email;

    public User(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    public User(User user){
        firstName = user.firstName;
        lastName = user.lastName;
        username = user.username;
        email = user.email;
    }

    public User copy () {
        return new User(this);
    }


}
