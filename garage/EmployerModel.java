package model;

import java.sql.Date;

public class EmployerModel extends BaseModel {
    String nom;
    String prenom;
    int idGenre;
    Date ddn;
    int idNiveau;
    int idSpeciaite;
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getIdGenre() {
        return idGenre;
    }
    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }
    public Date getDdn() {
        return ddn;
    }
    public void setDdn(Date ddn) {
        this.ddn = ddn;
    }
    public int getIdNiveau() {
        return idNiveau;
    }
    public void setIdNiveau(int idNiveau) {
        this.idNiveau = idNiveau;
    }
    public int getIdSpeciaite() {
        return idSpeciaite;
    }
    public void setIdSpeciaite(int idSpeciaite) {
        this.idSpeciaite = idSpeciaite;
    }

    

}
