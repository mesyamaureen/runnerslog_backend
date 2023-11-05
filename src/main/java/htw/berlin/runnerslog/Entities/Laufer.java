package htw.berlin.runnerslog.Entities;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Laufer extends User {
    private Double groesse;
    private Double gewicht;
    private String geschlecht;
    private Date geburtsDatum;

    //parameterloser Konstruktor
    public Laufer() {}

    //Konstruktor mit parameter
    public Laufer(Double groesse, Double gewicht, String geschlecht, Date geburtsDatum) {
    this.groesse = groesse;
    this.gewicht = gewicht;
    this.geschlecht = geschlecht;
    this.geburtsDatum = geburtsDatum;
    }

    //getter setter
    public Double getGroesse() { return groesse; }
    public void setGroesse(Double groesse) { this.groesse = groesse; }
    public Double getGewicht() { return gewicht; }
    public void setGewicht(Double gewicht) { this.gewicht = gewicht; }
    public String getGeschlecht() { return geschlecht; }
    public void setGeschlecht(String geschlecht) { this.geschlecht = geschlecht; }
    public Date getGeburtsDatum() { return geburtsDatum; }
    public void setGeburtsDatum(Date geburtsDatum) { this.geburtsDatum = geburtsDatum; }

}
