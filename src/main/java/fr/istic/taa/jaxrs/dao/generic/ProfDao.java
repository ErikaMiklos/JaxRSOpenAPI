package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.domain.Prof;

import javax.persistence.EntityManager;
import java.util.List;

public class ProfDao{
    EntityManager manager = EntityManagerHelper.getEntityManager();

    public void createProfs() {

        int numOfProfs = manager.createQuery("Select p From Prof p", Prof.class).getResultList().size();
        if (numOfProfs == 0) {

            Prof prof1 = new Prof("MAN");
            prof1.setNom("Gipsz");
            prof1.setPrenom("Jakab");
            prof1.setMatricule((int)(Math.random()*1000));
            manager.persist(prof1);

            Prof prof2 = new Prof("IA");
            prof2.setPrenom("Zoltan");
            prof2.setNom("Miklos");
            prof2.setMatricule((int)(Math.random()*1000));
            manager.persist(prof2);

            Prof prof3 = new Prof("TAA");
            prof3.setPrenom("Olivier");
            prof3.setNom("Barais");
            prof3.setMatricule((int)(Math.random()*1000));
            manager.persist(prof3);

        }
    }

    public void listProfs() {
        List<Prof> resultList = manager.createQuery("Select p From Prof p", Prof.class).getResultList();
        System.out.println("num of profs:" + resultList.size());
        for (Prof next : resultList) {
            System.out.println("next prof: " + next);
        }
    }

    public void listProfsBySujet(String s) {
        List<Prof> resultList = manager.createQuery("Select p From Prof p where p.sujet =:sujet", Prof.class)
                .setParameter("sujet", s)
                .getResultList();
        System.out.println("num of profs: " + resultList.size());
        for (Prof prof : resultList) {
            System.out.println("prof of " + s + " : " + prof.getNom());
        }
    }

    public Prof getProfById(Long id) {
        Prof prof= manager.createQuery("Select p From Prof p where p.idU =:id", Prof.class)
                .setParameter("id", id)
                .getSingleResult();
        return prof;
    }


}
