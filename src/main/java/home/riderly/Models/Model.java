package home.riderly.Models;

import home.riderly.Views.ViewFactory;

public class Model {
    private final ViewFactory viewFactory;
    private static Model model;
    private boolean clientLoginSuccessFlag;

    private Model(){
        this.viewFactory=new ViewFactory();
        this.clientLoginSuccessFlag = false;
    }
    public boolean getClientLoginSuccessFlag() {return this.clientLoginSuccessFlag;}
    public void setClientLoginSuccessFlag(boolean flag) {this.clientLoginSuccessFlag = false;}

    public static synchronized Model getInstance(){
        if(model == null){
            model = new Model();
        }
        return model;
    }
    public ViewFactory getViewFactory(){
        return viewFactory;
    }
}
