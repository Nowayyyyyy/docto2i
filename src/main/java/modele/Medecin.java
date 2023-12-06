package modele;

import jakarta.persistence.*;

@Entity
public class Medecin extends Personne{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medecin_id")
    private int id;

    @Column(name = "login",
            unique = true,
            nullable = true,
            length = 255)
            //columnDefinition = "VARCHAR(255) default 'INCONNU'")
    private String login;

    @Column( name="mdp",
            unique = true,
            nullable = true,
            length = 255)
            //columnDefinition = "VARCHAR(255) default 'INCONNU'")
    private String mdp;

    @Column(name = "appartient",
            unique = true,
            nullable = true,
            length = 255)
            //columnDefinition = "VARCHAR(255) default 'INCONNU'")
    private String appartient ;

    @Column(name ="numero",
            unique = true)
    private int numeroPro;


    public Medecin(){
        super("INCONNU", "INCONNU","INCONNU","INCONNU");
        this.login = "INCONNU";
        this.mdp = "INCONNU";
        this.numeroPro=0;
        this.appartient="INCONNU";

    }

    public Medecin(String nom, String prenom, String dateNaissance,String adresse, String login, String Mdp, int numeroPro, String appartient){
        super(nom, prenom,dateNaissance, adresse);
        this.login = login;
        this.mdp = Mdp;
        this.appartient=appartient;
        this.numeroPro=numeroPro;
    }

    /*public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/



    @Override
    public String toString() {
        return super.toString()+"login ="+ login + "mdp="+mdp+ "numéroPro"+numeroPro+"appartient à"+appartient;
    }
}
