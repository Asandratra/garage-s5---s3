package model;


public class ModeleModel {
    int idMarque;
    String nom;

    public ModeleModel(){}

    public ModeleModel(int idMarque, String nom) {
        this.idMarque = idMarque;
        this.nom = nom;
    }

    public int getIdMarque() {
        return idMarque;
    }
    public void setIdMarque(int idMarque) {
        this.idMarque = idMarque;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    
}
