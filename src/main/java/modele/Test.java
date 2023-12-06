package modele;

import jakarta.persistence.*;
import modele.*;

import java.util.Date;
import java.util.List;

public class Test {


    public static void main(String[] args) {

        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hopital2iPU");
        final EntityManager em = emf.createEntityManager();
        try {
            final EntityTransaction et = em.getTransaction();
            try {
                et.begin();

                Patient patient1 = new Patient("Masse","Sarah","07/04/1950","rue du A", "suivie");
                Cadre cadre1 = new Cadre("gasparda","AlzaGard","06/05/1975","171, Rue Champollion, Dunkerque","gasparda","AlzaGard");
                Medecin med1 = new Medecin("Etdefondouze","Candice","27/06/1984","7, Rue Gustave Delory, Arras","candicee","tfoouene",2319,"interne");
                CreneauHoraireDispo creneau1 = new CreneauHoraireDispo("15H20");
                SalleDispo uneSalleDispo = new SalleDispo("bleu");
                RDVaFaire leRDV = new RDVaFaire(patient1,med1,creneau1,uneSalleDispo,"01/01/2023/media/julie/UBUNTU 22_0/Projet POO/demo/src/main/java/front");

                Query query = em.createNamedQuery("identification");
                List<String[]> results = query.getResultList();

                System.out.println("test " +results);

                System.out.println("coucou");



                em.persist(patient1);
                em.persist(cadre1);
                em.persist(med1);
                em.persist(creneau1);
                em.persist(uneSalleDispo);
                em.persist(leRDV);







                et.commit();
            }catch (Exception ex){
                System.out.println("exception:"  + ex);
                System.out.println("rollback");
                et.rollback();
            }
        }finally {
            if (em!=null && em.isOpen()){
                em.close();
            }
            if(emf != null && emf.isOpen()){
                emf.close();
            }
        }
    }


}

