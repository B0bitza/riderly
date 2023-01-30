package home.riderly.Models;


/**
 * The class Istoric trotineta
 */
public class IstoricTrotineta {
    private int id;
    private String RideUser;
    private String trotineta;
    private String dataInchiriere;


    /**
     *
     * It is a constructor.
     *
     * @param id  the id
     * @param rideUser  the ride user
     * @param trotineta  the trotineta
     * @param dataInchiriere  the data inchiriere
     */
    public IstoricTrotineta(int id, String rideUser, String trotineta, String dataInchiriere) {

        this.id = id;
        RideUser = rideUser;
        this.trotineta = trotineta;
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
     * Gets the trotineta
     *
     * @return the trotineta
     */
    public String getTrotineta() {

        return trotineta;
    }


    /**
     *
     * Sets the trotineta
     *
     * @param trotineta  the trotineta
     */
    public void setTrotineta(String trotineta) {

        this.trotineta = trotineta;
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
