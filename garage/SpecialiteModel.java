package model;

import dao.*;
import service.*;




public class SpecialiteModel extends BaseModel{
    String nom;

    public SpecialiteModel(){}
    
    public SpecialiteModel(String n){
        this.nom = n;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}