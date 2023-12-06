package modele;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SalleDispo {

      //aaaaaaaaaa



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "SALLENO")
        private int id;

        @Column(name = "nom", unique = true, nullable = false, length = 255)
        private String nom;

        @OneToMany(mappedBy = "uneSalle")
        private List<RDVaFaire> rdvs;

        public SalleDispo() {
                this.nom="INCONNU";
        }

        public SalleDispo(String nom) {
                this.nom = nom;
        }

        public String getNom() {
                return nom;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public List<RDVaFaire> getRdvs() {
                return rdvs;
        }

        public void setRdvs(List<RDVaFaire> rdvs) {
                this.rdvs = rdvs;
        }

        @Override
        public String toString() {
            return "Salle Disponible {" +
                    "id=" + id +
                    ", nom='" + nom + '\'' +
                   
                    '}';
        }


}
