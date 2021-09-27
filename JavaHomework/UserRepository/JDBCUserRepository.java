package JavaHomework.UserRepository;

import JavaHomework.ListAndSet.User;

import java.sql.*;

public class JDBCUserRepository implements UserRepository{

    private static Statement statement;

    @Override
    public void save(User user) {
        try {
            Connection connection = DbConnection.getConnection();
            Statement statement = connection.createStatement();
            statement.execute("insert into users (name, age) values (" +"' " +user.getName()+"'" +","+user.getAge()+")");
            statement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void deleteAll() {
        try {
            Connection connection = DbConnection.getConnection();
            Statement statement = connection.createStatement();
            statement.execute("delete from users");
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
