package modele;

import jakarta.persistence.*;

@Entity
public class CreneauHoraireDispo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "creneauDispo_id")
    private int id;

    @Column(name = "NOM",
            unique = true,
            nullable = false,
            length = 255)
    private String horaireDebut;

    public CreneauHoraireDispo(String horaireDebut) {
        this.horaireDebut = horaireDebut;

    }

    public CreneauHoraireDispo() {
        this.horaireDebut="INCONNU";
    }

    public String getHoraireDebut() {
        return horaireDebut;
    }

    public void setHoraireDebut(String horaireDebut) {
        this.horaireDebut = horaireDebut;
    }

    @Override
    public String toString() {
        return "CreneauHoraireDispo{" +
                "id=" + id +
                ", horaireDebut='" + horaireDebut + '\'' +
                '}';
    }
}
