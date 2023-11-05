package htw.berlin.runnerslog.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalTime;
import java.util.Date;

@Entity
public class Laufplan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date datum;
    private String titel;
    private String beschreibung;
    private Boolean status;
    private LocalTime zeit;

    public Laufplan(){}

    public Laufplan(Date datum, String titel, String beschreibung, Boolean status, LocalTime zeit) {
        this.datum = datum;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.status = status;
        this.zeit = zeit;
    }

    //getter setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Date getDatum() { return datum; }
    public void setDatum(Date datum) { this.datum = datum; }
    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }
    public Boolean getStatus() { return status;}
    public void setStatus(Boolean status) {this.status = status; }
    public LocalTime getZeit() { return zeit; }
    public void setZeit(LocalTime zeit) { this.zeit = zeit; }
}
