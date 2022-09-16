package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.domain.Prof;

public interface IProfDao {

    void createProfs();
    void listProfs();
    void listProfsBySujet(String s);

    Prof getProfById(Long id);
}
