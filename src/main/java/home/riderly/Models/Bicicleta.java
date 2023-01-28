package home.riderly.Models;

public class Bicicleta {
    private String tip;
    private String nume;
    private boolean fault;

    public Bicicleta(String tip, String nume, boolean fault) {
        this.tip = tip;
        this.nume = nume;
        this.fault = fault;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isFault() {
        return fault;
    }

    public void setFault(boolean fault) {
        this.fault = fault;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tip='" + tip + '\'' +
                ", nume='" + nume + '\'' +
                ", fault=" + fault +
                '}';
    }
}
