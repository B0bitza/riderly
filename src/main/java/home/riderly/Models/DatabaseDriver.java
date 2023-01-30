package home.riderly.Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;


/**
 * The class Database driver
 */
public class DatabaseDriver {
    private Connection conn;


    /**
     *
     * It is a constructor.
     *
     */
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

    /**
     *
     * Gets the client data
     *
     * @param username  the username
     * @param password  the password
     * @return the client data
     */
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

    /**
     *
     * Insert report
     *
     * @param tipProblema  the tip problema
     * @param descriere  the descriere
     * @param data  the data
     */
    public void insertReport(String tipProblema, String descriere, String data) {

        Statement statement;
        try {
            statement = this.conn.createStatement();
            statement.executeUpdate("INSERT INTO reports (tipProblema,descriere,data) VALUES ('"+tipProblema+"','"+descriere+"','"+data+"');");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * Update bike status
     *
     * @param numeBicicleta  the nume bicicleta
     * @param status  the status
     */
    public void updateBikeStatus(String numeBicicleta, String status) {

        Statement statement;
        try {
            statement = this.conn.createStatement();
            statement.executeUpdate("UPDATE biciclete SET ocupat='"+status+"' WHERE id='"+numeBicicleta+"';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * Update trot status
     *
     * @param numeTrotineta  the nume trotineta
     * @param status  the status
     */
    public void updateTrotStatus(String numeTrotineta, String status) {

        Statement statement;
        try {
            statement = this.conn.createStatement();
            statement.executeUpdate("UPDATE trotinete SET ocupat='"+status+"' WHERE id='"+numeTrotineta+"';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * Update user status
     *
     * @param numeClient  the nume client
     * @param status  the status
     */
    public void updateUserStatus(String numeClient, String status) {

        Statement statement;
        try {
            statement = this.conn.createStatement();
            statement.executeUpdate("UPDATE RideUsers SET statusInchiriere='"+status+"' WHERE id='"+numeClient+"';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * Gets the istoric bic
     *
     * @return the istoric bic
     */
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


    /**
     *
     * Gets the istoric trot
     *
     * @return the istoric trot
     */
    public ObservableList<IstoricTrotineta>  getIstoricTrot() {

        ObservableList<IstoricTrotineta> trotinete = FXCollections.observableArrayList();;
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM istoricTrotinete");
            //insert the data
            while (resultSet.next()) {
                trotinete.add(new IstoricTrotineta(resultSet.getInt("id"), resultSet.getString("RideUser"), resultSet.getString("trotineta"), resultSet.getString("data")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trotinete;
    }



    /**
     *
     * Insert into istoric
     *
     * @param User  the user
     * @param Tip  the tip
     */
    public void insertIntoIstoric(String User, String Tip){

        Statement statement;
        try {
            statement = this.conn.createStatement();
            statement.executeUpdate("INSERT INTO istoricBiciclete (RideUser,bicicleta,data) VALUES ('"+User+"','"+Tip+"',datetime('now','localtime'));");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * Insert into istoric2
     *
     * @param User  the user
     * @param Tip  the tip
     */
    public void insertIntoIstoric2(String User, String Tip){

        Statement statement;
        try {
            statement = this.conn.createStatement();
            statement.executeUpdate("INSERT INTO istoricTrotinete (RideUser,trotineta,data) VALUES ('"+User+"','"+Tip+"',datetime('now','localtime'));");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
