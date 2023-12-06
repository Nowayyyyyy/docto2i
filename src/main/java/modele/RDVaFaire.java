package modele;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class RDVaFaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RDVNO")
    private int id;


    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient unPatient ;

    @ManyToOne
    @JoinColumn(name = "medecin_id")
    private Medecin unMedecin;

    @ManyToOne
    @JoinColumn(name = "creneauDispo_id")
    private CreneauHoraireDispo unCreneau;
    @ManyToOne
    @JoinColumn(name = "salle_id")
    private  SalleDispo uneSalle;

    @Column(name = "dateRDV",
            unique = true,
            nullable = true)

    private String dateRDV;

    public RDVaFaire(Patient unPatient, Medecin unMedecin, CreneauHoraireDispo unCreneau, SalleDispo uneSalle,String dateRDV) {
        this.unPatient = unPatient;
        this.unMedecin = unMedecin;
        this.unCreneau = unCreneau;
        this.uneSalle = uneSalle;
        this.dateRDV =dateRDV;
    }

    public RDVaFaire() {

    }

    public Patient getUnPatient() {
        return unPatient;
    }

    public void setUnPatient(Patient unPatient) {
        this.unPatient = unPatient;
    }

    public Medecin getUnMedecin() {
        return unMedecin;
    }

    public void setUnMedecin(Medecin unMedecin) {
        this.unMedecin = unMedecin;
    }

    public CreneauHoraireDispo getUnCreneau() {
        return unCreneau;
    }

    public void setUnCreneau(CreneauHoraireDispo unCreneau) {
        this.unCreneau = unCreneau;
    }

    public SalleDispo getUneSalle() {
        return uneSalle;
    }

    public void setUneSalle(SalleDispo uneSalle) {
        this.uneSalle = uneSalle;
    }

    @Override
    public String toString() {
        return "RDVaFaire{" +
                "id=" + id +
                ", unPatient=" + unPatient +
                ", unMedecin=" + unMedecin +
                ", unCreneau=" + unCreneau +
                ", uneSalle=" + uneSalle +
                '}';
    }
}
