/*package modele;

import java.io.StringReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Requetes {
    private Connection connexBDD ;

    private void setConnexBDD (){
        String nomClasseDriver = "com.mysql.cj.jdbc.Driver";
        String urlBDD = "jdbc:mysql://localhost:3306/hopital2iPU";
        String utilisateur = "root";
        String motDePasse = "GMPRmmcH";
        Class.forName(nomClasseDriver);
        Connection connexionBDD = DriverManager.getConnection(urlBDD,
                utilisateur, motDePasse);


    }

    Requetes req (){

    }
    public boolean checkConnex(String login, String mdp){
        boolean trouve = false;
        String requete = "SELECT login FROM Personne ";
        PreparedStatement pstm = connexionBDD.prepareStatement(requete);
        pstmt.setString(1, login);
        ResultSet res = pstmt.executeQuery();
        while (res.next()) {
            System.out.println(res.getString("login"));

        }
        res.close();
        pstmt.close();

        if(trouve==true) return true;

        return false;

    }


}  */
