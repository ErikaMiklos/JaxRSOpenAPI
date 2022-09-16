package fr.istic.taa.jaxrs.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rdv {

    private long idR;

    private Date date;

    private Date heure;

    private Prof prof;
    private Eleve eleve;

    public Rdv() {
    }

    public Rdv(long idR, Date date, Date heure, Prof prof, Eleve eleve) {
        this.idR = idR;
        this.date = date;
        this.heure = heure;
        this.prof = prof;
        this.eleve = eleve;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getIdR() {
        return idR;
    }

    public void setIdR(long idR) {
        this.idR = idR;
    }

    @Temporal(TemporalType.DATE)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Temporal(TemporalType.TIME)
    public Date getHeure() {
        return heure;
    }

    public void setHeure(Date heure) {
        this.heure = heure;
    }

    @ManyToOne
    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    @ManyToOne
    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    @Override
    public String toString() {
        return "Rdv{" +
                "idR=" + idR +
                ", date=" + date +
                ", heure=" + heure +
                '}';
    }
}
