package modele;

import jakarta.persistence.*;

@Table(name="personne",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"NOM","PRENOM"})

        })

@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERSNO")
    private int id;

    @Column(name = "NOM",
            unique = true,
            nullable = false,
            length = 255)
    private String nom;

    @Column(name = "PRENOM",
            unique = false,
            length = 255,
            nullable= false
    )
    private String prenom ;

    @Column(name = "ADRESSE",
            unique = false,
            length = 255,
            nullable= false
    )
    private String adresse;

    @Column(name = "DateNaiss",
            unique = false,
            length = 255,
            nullable= false
    )
    private String dateNaissance;

    public Personne(String nom, String prenom,String dateNaissance,String adresse) {
        this.nom = nom.toUpperCase();
        this.prenom = prenom.toUpperCase()  ;
        this.adresse = adresse.toUpperCase();
        this.dateNaissance = dateNaissance.toUpperCase();
    }

    public Personne() {
        this.nom="INCONNU";
        this.prenom="INCONNU";
        this.adresse="INCONNU";
        this.dateNaissance="INCONNU";
    }

    public String getNom() {
        return this.nom;

    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom.toUpperCase();
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse +'\''+
                '}';
    }
}
