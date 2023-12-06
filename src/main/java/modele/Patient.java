package modele;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Patient extends Personne{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int id;

    @OneToMany(mappedBy = "unPatient")
    private List<RDVaFaire> rendezVous;

    @Column(
            unique = true,
            nullable = true,
            length = 255)
            //columnDefinition = "VARCHAR(255) default 'INCONNU'")
    private String motif;

    public Patient(){
        super("INCONNU", "INCONNU","INCONNU","INCONNU");
        this.motif = "INCONNU";
    }

    public Patient(String nom, String prenom, String dateNaissance,String adresse, String motif){
        super(nom, prenom,dateNaissance, adresse);
        this.motif = motif;
    }

    /*public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    @Override
    public String toString() {
        return super.toString()+"motif ="+ motif;
    }
}
