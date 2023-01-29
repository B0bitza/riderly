package home.riderly.Models;

public class IstoricTrotineta {
    private int id;
    private String RideUser;
    private String trotineta;
    private String dataInchiriere;

    public IstoricTrotineta(int id, String rideUser, String trotineta, String dataInchiriere) {
        this.id = id;
        RideUser = rideUser;
        this.trotineta = trotineta;
        this.dataInchiriere = dataInchiriere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRideUser() {
        return RideUser;
    }

    public void setRideUser(String rideUser) {
        RideUser = rideUser;
    }

    public String getTrotineta() {
        return trotineta;
    }

    public void setTrotineta(String trotineta) {
        this.trotineta = trotineta;
    }

    public String getDataInchiriere() {
        return dataInchiriere;
    }

    public void setDataInchiriere(String dataInchiriere) {
        this.dataInchiriere = dataInchiriere;
    }
}
