package home.riderly.Models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User {
    private final StringProperty username;
    private final StringProperty statusInchiriere;
    public User(String username,int statusInchiriere){
        this.username=new SimpleStringProperty(this,"username",username);
        this.statusInchiriere=new SimpleStringProperty(this,"statusInchiriere",String.valueOf(statusInchiriere));
    }

    public StringProperty usernameProperty(){return username;}
    public StringProperty statusProperty(){return statusInchiriere;}

}
