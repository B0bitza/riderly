package home.riderly.Models;

import home.riderly.Views.ViewFactory;

import javax.sql.RowSet;
import java.sql.ResultSet;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;
    private final DatabaseDriver databaseDriver;
    private final User user;
    private boolean clientLoginSuccessFlag;
    private boolean emptyFieldsFlag;

    private Model(){
        this.databaseDriver = new DatabaseDriver();
        this.viewFactory = new ViewFactory();
        this.clientLoginSuccessFlag = false;
        this.emptyFieldsFlag = false;
        this.user= new User("",0);
    }
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
    public ViewFactory getViewFactory(){
        return viewFactory;
    }
    public DatabaseDriver getDatabaseDriver(){return databaseDriver;}
    public User getUser(){
        return user;
    }
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

    public void insertReport(String tipProblema, String descriere, String data) {
        databaseDriver.insertReport(tipProblema,descriere,data);

    }
}
