package model;

import java.sql.Date;


public class GainModel {
    int idIntervention;
    Date daty;
    double montant;

    
    public GainModel(){

    }
    public GainModel(int idIntervention, Date daty, double montant) {
        this.idIntervention = idIntervention;
        this.daty = daty;
        this.montant = montant;

    }
    public int getIdIntervention() {
        return idIntervention;
    }
    public void setIdIntervention(int idIntervention) {
        this.idIntervention = idIntervention;
    }
    public Date getDaty() {
        return daty;
    }
    public void setDaty(Date daty) {
        this.daty = daty;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }

    
}
