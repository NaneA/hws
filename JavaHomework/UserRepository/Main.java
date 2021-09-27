package JavaHomework.UserRepository;

import JavaHomework.ListAndSet.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

        JDBCUserRepository jdbcUserRepository = new JDBCUserRepository();
        User user1 = new User(1, "new user");
        jdbcUserRepository.save(user1);
        jdbcUserRepository.deleteAll();
}}
