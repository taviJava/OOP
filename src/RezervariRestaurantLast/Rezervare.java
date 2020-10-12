package RezervariRestaurantLast;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Rezervare implements Serializable {
    private LocalDateTime dataDeInceput;
    private LocalDateTime dataDePlecare;
    private  int numarPersoane;
    private String numePersoanaCareARezervat;

    public Rezervare() {
        this.dataDeInceput = dataDeInceput;
        this.dataDePlecare = dataDePlecare;
        this.numarPersoane = numarPersoane;
        this.numePersoanaCareARezervat=numePersoanaCareARezervat;
    }

    public Rezervare(int numarPersoane,LocalDateTime dataDeInceput, LocalDateTime dataDePlecare,String numePersoanaCareARezervat) {
        this.dataDeInceput = dataDeInceput;
        this.dataDePlecare = dataDePlecare;
        this.numarPersoane = numarPersoane;
        this.numePersoanaCareARezervat=numePersoanaCareARezervat;
    }



    public LocalDateTime getDataDeInceput() {
        return dataDeInceput;
    }

    public LocalDateTime getDataDePlecare() {
        return dataDePlecare;
    }

    public String getNumePersoanaCareARezervat() {
        return numePersoanaCareARezervat;
    }

    public int getNumarPersoane() {
        return numarPersoane;

    }

}
