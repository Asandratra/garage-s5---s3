package model;

import java.sql.Date;

public class DepenseModel {
    int idFrais;
    Date daty;
    double montant;

    public DepenseModel(){

    }

    public DepenseModel(int idFrais, Date daty, double montant) {
        this.idFrais = idFrais;
        this.daty = daty;
        this.montant = montant;
    }

    public int getIdFrais() {
        return idFrais;
    }
    public void setIdFrais(int idFrais) {
        this.idFrais = idFrais;
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

