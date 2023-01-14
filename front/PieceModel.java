package model;


public class PieceModel {
    int idModele;
    String nom;

    public PieceModel(){

    }
    public PieceModel(int idModele, String nom) {
        this.idModele = idModele;
        this.nom = nom;
    }
    public int getIdModele() {
        return idModele;
    }
    public void setIdModele(int idModele) {
        this.idModele = idModele;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    
}
