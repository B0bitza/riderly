package home.riderly.Models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
/**
 * The class User
 */
public class User {
    private final StringProperty username;
    private final StringProperty statusInchiriere;
    /**
     *
     * It is a constructor.
     *
     * @param username  the username
     * @param statusInchiriere  the status inchiriere
     */
    public User(String username,int statusInchiriere){
        this.username=new SimpleStringProperty(this,"username",username);
        this.statusInchiriere=new SimpleStringProperty(this,"statusInchiriere",String.valueOf(statusInchiriere));
    }

    public StringProperty usernameProperty(){return username;}
    public StringProperty statusProperty(){return statusInchiriere;}

}
