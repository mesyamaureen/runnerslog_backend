package htw.berlin.runnerslog.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vorname;
    private String name;
    private String email;

    // parameterloser Konstruktor
    public Trainer() {}

    // Konstruktor mit Parameter
    public Trainer(String vorname, String name, String email) {
        this.vorname = vorname;
        this.name = name;
        this.email = email;
    }

    // GetterSetter jedes Attributs
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getVorname() { return vorname; }
    public void setVorname(String vorname) { this.vorname = vorname; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

}
