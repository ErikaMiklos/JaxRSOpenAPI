package fr.istic.taa.jaxrs.dao.generic;



import fr.istic.taa.jaxrs.domain.Eleve;

import javax.persistence.EntityManager;
import java.util.List;

public class EleveDao implements IEleveDao{
    EntityManager manager = EntityManagerHelper.getEntityManager();

    @Override
    public void createEleves() {
        int numOfEleves = manager.createQuery("Select e From Eleve e", Eleve.class).getResultList().size();
        if (numOfEleves == 0) {

            double grade = Math.round((Math.random()*20)*100)/100;
            Eleve eleve1 = new Eleve(grade);
            eleve1.setNom("Miklos");
            eleve1.setPrenom("Erika");
            eleve1.setMatricule((int)(Math.random()*1000));
            manager.persist(eleve1);

            grade = Math.round((Math.random()*20)*100)/100;
            Eleve eleve2 = new Eleve(grade);
            eleve2.setNom("Debrandt");
            eleve2.setPrenom("William");
            eleve2.setMatricule((int)(Math.random()*1000));
            manager.persist(eleve2);

            grade = Math.round((Math.random()*20)*100)/100;
            Eleve eleve3 = new Eleve(grade);
            eleve3.setNom("Favorou");
            eleve3.setPrenom("Harold");
            eleve3.setMatricule((int)(Math.random()*1000));
            manager.persist(eleve3);


        }

    }

    @Override
    public void listEleves() {
        List<Eleve> resultList = manager.createQuery("Select e From Eleve e", Eleve.class).getResultList();
        System.out.println("num of eleves:" + resultList.size());
        for (Eleve next : resultList) {
            System.out.println("next eleve: " + next);
        }
    }
}
