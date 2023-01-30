package home.riderly.Models;

import home.riderly.Views.ViewFactory;

import javax.sql.RowSet;
import java.sql.ResultSet;


/**
 * The class Model
 */
public class Model {
    private static Model model;
    private final ViewFactory viewFactory;
    private final DatabaseDriver databaseDriver;
    private final User user;
    private boolean clientLoginSuccessFlag;
    private boolean emptyFieldsFlag;


    /**
     *
     * It is a constructor.
     *
     */
    private Model(){

        this.databaseDriver = new DatabaseDriver();
        this.viewFactory = new ViewFactory();
        this.clientLoginSuccessFlag = false;
        this.emptyFieldsFlag = false;
        this.user= new User("",0);
    }


    /**
     *
     * It is a constructor.
     *
     */
    public boolean getClientLoginSuccessFlag() {return this.clientLoginSuccessFlag;}
    public void setClientLoginSuccessFlag(boolean flag) {this.clientLoginSuccessFlag = false;}
    public boolean getEmptyFieldsFlag() {return this.emptyFieldsFlag;}
    public void setEmptyFieldsFlag(boolean flag) {this.emptyFieldsFlag = false;}

    public static synchronized Model getInstance(){

        if(model == null){
            model = new Model();
        }
        return model;
    }

    /**
     *
     * Gets the view factory
     *
     * @return the view factory
     */
    public ViewFactory getViewFactory(){

        return viewFactory;
    }


    /**
     *
     * Gets the database driver
     *
     * @return the database driver
     * @throws return databaseDriver;}
    public User getUser(
     */
    public DatabaseDriver getDatabaseDriver(){return databaseDriver;}
    public User getUser(){

        return user;
    }

    /**
     *
     * Evaluate client cred
     *
     * @param username  the username
     * @param password  the password
     */
    public void evaluateClientCred(String username, String password) {

        ResultSet resultSet = databaseDriver.getClientData(username, password);
        try {
            if (resultSet.isBeforeFirst()){
                this.user.usernameProperty().set(resultSet.getString("username"));
                this.user.statusProperty().set(resultSet.getString("statusInchiriere"));
                this.clientLoginSuccessFlag = true;
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     *
     * Insert report
     *
     * @param tipProblema  the tip problema
     * @param descriere  the descriere
     * @param data  the data
     */
    public void insertReport(String tipProblema, String descriere, String data) {

        databaseDriver.insertReport(tipProblema,descriere,data);

    }
}
