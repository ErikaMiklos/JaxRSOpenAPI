package fr.istic.taa.jaxrs.domain;

import javax.persistence.*;

@Entity
@Inheritance
public class User {
    private Long idU;
    private String prenom;
    private String nom;
    private int matricule;

    public User() {
    }

    public User(Long idU, String prenom, String nom, int matricule) {
        this.idU = idU;
        this.prenom = prenom;
        this.nom = nom;
        this.matricule = matricule;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getIdU() {
        return idU;
    }

    public void setIdU(Long idU) {
        this.idU = idU;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int numCni) {
        this.matricule = numCni;
    }

    @Override
    public String toString() {
        return "User{" +
                "idU=" + idU +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", numCni=" + matricule +
                '}';
    }
}
