package home.riderly.Models;

import javax.sql.RowSet;
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
            resultSet = statement.executeQuery("SELECT * FROM RideUsers WHERE username='"+username+"' AND password='"+password+"';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
    /*
     * Utility Methods
     * */
    public void insertReport(String tipProblema, String descriere, String data) {
        Statement statement;
        try {
            statement = this.conn.createStatement();
            statement.executeUpdate("INSERT INTO reports (tipProblema,descriere,data) VALUES ('"+tipProblema+"','"+descriere+"','"+data+"');");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
