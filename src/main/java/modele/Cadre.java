package modele;

import jakarta.persistence.*;

@Entity
public class Cadre extends Personne  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CADRENO")
    private int id;


    @Column(name = "login",
            unique = true,
            nullable = true,
            length = 255)
    //columnDefinition = "VARCHAR(255) default 'INCONNU'")
    private String login;

    @Column(
            unique = true,
            nullable = true,
            length = 255)
            //columnDefinition = "VARCHAR(255) default 'INCONNU'")
    private String mdp;

    public Cadre(){
        super("INCONNU", "INCONNU","INCONNU","INCONNU");
        this.login = "INCONNU";
        this.mdp = "INCONNU";
    }

    public Cadre(String nom, String prenom, String dateNaissance,String adresse, String login, String mdp){
        super(nom, prenom,dateNaissance, adresse);
        this.login = login;
        this.mdp = mdp;
    }

    /*public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public String getLogin() {
        return login;
    }

    public void setMdp(String mdp){
        this.mdp =mdp;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
