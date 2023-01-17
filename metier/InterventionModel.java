package model;


import java.sql.Date;


public class InterventionModel {
    Date debut;
    Date prevision;
    int idClient;
    int idVehicule;
    double prixTotal;

    public InterventionModel(){

    }
    

    public InterventionModel(Date debut, Date prevision, int idClient, int idVehicule, double prixTotal) {
        this.debut = debut;
        this.prevision = prevision;
        this.idClient = idClient;
        this.idVehicule = idVehicule;
        this.prixTotal = prixTotal;
    }


    public Date getDebut() {
        return debut;
    }
    public void setDebut(Date debut) {
        this.debut = debut;
    }
    public Date getPrevision() {
        return prevision;
    }
    public void setPrevision(Date prevision) {
        this.prevision = prevision;
    }
    public int getIdClient() {
        return idClient;
    }
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    public int getIdVehicule() {
        return idVehicule;
    }
    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }
    public double getPrixTotal() {
        return prixTotal;
    }
    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }

    
}
