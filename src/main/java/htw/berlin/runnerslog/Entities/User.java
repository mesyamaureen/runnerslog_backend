package htw.berlin.runnerslog.Entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String benutzername;
    private String passwort;
    private String name;
    private String vorname;
    private String eMail;

    // parameterloser Konstruktor
    public User() {}

    // Konstruktor mit Parameter
    public User(String benutzername, String passwort, String name, String vorname, String eMail) {
        this.benutzername = benutzername;
        this.passwort = passwort;
        this.name = name;
        this.vorname = vorname;
        this.eMail = eMail;
    }

    // GetterSetter jedes Attributs
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getBenutzername() { return benutzername; }
    public void setBenutzername(String benutzername) { this.benutzername = benutzername; }
    public String getPasswort() { return passwort; }
    public void setPasswort(String passwort) { this.passwort = passwort; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getVorname() { return vorname; }
    public void setVorname(String vorname) { this.vorname = vorname; }
    public String geteMail() { return eMail; }
    public void seteMail(String eMail) { this.eMail = eMail; }

}
