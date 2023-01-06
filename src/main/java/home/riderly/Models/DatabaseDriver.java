package home.riderly.Models;

import java.sql.*;

public class DatabaseDriver {
    private Connection conn;
    private java.sql.ResultSet ResultSet;


    public DatabaseDriver() {
        try {
            this.conn = DriverManager.getConnection("jdbc:sqlite:riderly.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * Client Section
     * */
    public ResultSet getClientData(String username, String password) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Clients WHERE Username='"+username+"' AND Parola='"+password+"';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    /*
     * Admin Section
     * */

    public ResultSet getAdminData(String username, String password) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Admins WHERE Username='"+username+"' AND Password='"+password+"';");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    /*
     * Utility Methods
     * */
}
