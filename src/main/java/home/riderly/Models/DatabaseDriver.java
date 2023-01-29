package home.riderly.Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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

    public void updateBikeStatus(String numeBicicleta, String status) {
        Statement statement;
        try {
            statement = this.conn.createStatement();
            statement.executeUpdate("UPDATE biciclete SET ocupat='"+status+"' WHERE id='"+numeBicicleta+"';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*public void updateTrotStatus(String numeTrotineta, String status) {
        Statement statement;
        try {
            statement = this.conn.createStatement();
            statement.executeUpdate("UPDATE trotinete SET ocupat='"+status+"' WHERE id='"+numeTrotineta+"';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

    public void updateUserStatus(String numeClient, String status) {
        Statement statement;
        try {
            statement = this.conn.createStatement();
            statement.executeUpdate("UPDATE RideUsers SET statusInchiriere='"+status+"' WHERE id='"+numeClient+"';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<IstoricBicicleta>  getIstoricBic() {
        ObservableList<IstoricBicicleta> biciclete = FXCollections.observableArrayList();;
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM istoricBiciclete");
            //insert the data 
            while (resultSet.next()) {
                biciclete.add(new IstoricBicicleta(resultSet.getInt("id"), resultSet.getString("RideUser"), resultSet.getString("bicicleta"), resultSet.getString("data")));
            }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return biciclete;
}

   /* public ObservableList<IstoricTrotineta>  getIstoricTrot() {
        ObservableList<IstoricTrotineta> trotinete = FXCollections.observableArrayList();;
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM istoricTrotinete");
            //insert the data
            while (resultSet.next()) {
                trotinete.add(new IstoricTrotineta(resultSet.getInt("id"), resultSet.getString("RideUser"), resultSet.getString("bicicleta"), resultSet.getString("data")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trotinete;
    }*/


public void insertIntoIstoric(String User, String Tip){
    Statement statement;
    try {
        statement = this.conn.createStatement();
        statement.executeUpdate("INSERT INTO istoricBiciclete (RideUser,bicicleta,data) VALUES ('"+User+"','"+Tip+"',datetime('now','localtime'));");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

   /* public void insertIntoIstoric2(String User, String Tip){
        Statement statement;
        try {
            statement = this.conn.createStatement();
            statement.executeUpdate("INSERT INTO istoricTrotinete (RideUser,trotineta,data) VALUES ('"+User+"','"+Tip+"',datetime('now','localtime'));");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

}
