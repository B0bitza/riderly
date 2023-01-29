package home.riderly.Models;

public class IstoricBicicleta {
    private int id;
    private String RideUser;
    private String bicicleta;
    private String dataInchiriere;

    public IstoricBicicleta(int id, String rideUser, String bicicleta, String dataInchiriere) {
        this.id = id;
        RideUser = rideUser;
        this.bicicleta = bicicleta;
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

    public String getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(String bicicleta) {
        this.bicicleta = bicicleta;
    }

    public String getDataInchiriere() {
        return dataInchiriere;
    }

    public void setDataInchiriere(String dataInchiriere) {
        this.dataInchiriere = dataInchiriere;
    }
}
