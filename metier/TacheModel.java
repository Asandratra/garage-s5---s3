package model;


public class TacheModel {
    int idTypeTache;
    String nom;
    double prix;

    public TacheModel(){

    }
    
    public TacheModel(int idTypeTache, String nom, double prix) {
        this.idTypeTache = idTypeTache;
        this.nom = nom;
        this.prix = prix;
    }
    public int getIdTypeTache() {
        return idTypeTache;
    }
    public void setIdTypeTache(int idTypeTache) {
        this.idTypeTache = idTypeTache;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    
}
