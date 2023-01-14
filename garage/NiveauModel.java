package model;

public class NiveauModel extends BaseModel{
    String nom;

    public NiveauModel(){}
    
    public NiveauModel(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}