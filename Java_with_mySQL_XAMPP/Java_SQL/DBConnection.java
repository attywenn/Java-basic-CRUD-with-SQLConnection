import java.sql.*;

public class DBConnection {
    private static final String URL = 
    "jdbc:mysql://localhost:3307/inventory_db?useSSL=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}