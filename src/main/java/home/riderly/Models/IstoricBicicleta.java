package home.riderly.Models;


/**
 * The class Istoric bicicleta
 */
public class IstoricBicicleta {
    private int id;
    private String RideUser;
    private String bicicleta;
    private String dataInchiriere;


    /**
     *
     * It is a constructor.
     *
     * @param id  the id
     * @param rideUser  the ride user
     * @param bicicleta  the bicicleta
     * @param dataInchiriere  the data inchiriere
     */
    public IstoricBicicleta(int id, String rideUser, String bicicleta, String dataInchiriere) {

        this.id = id;
        RideUser = rideUser;
        this.bicicleta = bicicleta;
        this.dataInchiriere = dataInchiriere;
    }


    /**
     *
     * Gets the identifier
     *
     * @return the identifier
     */
    public int getId() {

        return id;
    }


    /**
     *
     * Sets the identifier
     *
     * @param id  the id
     */
    public void setId(int id) {

        this.id = id;
    }


    /**
     *
     * Gets the ride user
     *
     * @return the ride user
     */
    public String getRideUser() {

        return RideUser;
    }


    /**
     *
     * Sets the ride user
     *
     * @param rideUser  the ride user
     */
    public void setRideUser(String rideUser) {

        RideUser = rideUser;
    }


    /**
     *
     * Gets the bicicleta
     *
     * @return the bicicleta
     */
    public String getBicicleta() {

        return bicicleta;
    }


    /**
     *
     * Sets the bicicleta
     *
     * @param bicicleta  the bicicleta
     */
    public void setBicicleta(String bicicleta) {

        this.bicicleta = bicicleta;
    }


    /**
     *
     * Gets the data inchiriere
     *
     * @return the data inchiriere
     */
    public String getDataInchiriere() {

        return dataInchiriere;
    }


    /**
     *
     * Sets the data inchiriere
     *
     * @param dataInchiriere  the data inchiriere
     */
    public void setDataInchiriere(String dataInchiriere) {

        this.dataInchiriere = dataInchiriere;
    }
}
