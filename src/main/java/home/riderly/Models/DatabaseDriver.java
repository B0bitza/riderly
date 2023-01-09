package home.riderly.Models;

import java.sql.*;

public class DatabaseDriver {
    private Connection conn;

    public DatabaseDriver() {
        try {
            this.conn = DriverManager.getConnection("jdbc:sqlite:riderly.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * User Section
     * */
    public ResultSet getClientData(String username, String password) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
    /*
     * Utility Methods
     * */
}
