package model;

import java.sql.Date;


public class EntrerPieceModel{
    Date daty;
    int idPiece;
    int quantite;
    double prix;

    public EntrerPieceModel(){}
    public EntrerPieceModel(Date daty, int idPiece, int quantite, double prix) {
        this.daty = daty;
        this.idPiece = idPiece;
        this.quantite = quantite;
        this.prix = prix;
    }
    public Date getDaty() {
        return daty;
    }
    public void setDaty(Date daty) {
        this.daty = daty;
    }
    public int getIdPiece() {
        return idPiece;
    }
    public void setIdPiece(int idPiece) {
        this.idPiece = idPiece;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    

}