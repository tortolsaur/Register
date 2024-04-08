package login_register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    static final String DB_URL = "jdbc:mysql://localhost/clientdb";
    static final String USER = "root";
    static final String PASS = "120803@rabusa";

    public static Connection connectDB() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}