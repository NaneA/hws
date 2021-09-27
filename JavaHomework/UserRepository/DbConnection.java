package JavaHomework.UserRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static Connection connection;
    private static String url = "jdbc:postgresql://localhost:5434/aca";
    private static String name = "postgres";
    private static String password = "blah";


//    public DbConnection(String url,String name, String password) {
//        this.url = url;
//        this.name = name;
//        this.password = password;
//    }
    static {
    try {
        connection = DriverManager.getConnection(url, name, password);
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
      }
    public DbConnection() {
    }


    public static Connection getConnection(){
        return connection;
    }
}
