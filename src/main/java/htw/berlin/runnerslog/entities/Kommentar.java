package htw.berlin.runnerslog.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Kommentar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String beschreibung;

    public Kommentar(){}

    public Kommentar(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    //getter setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }
}
