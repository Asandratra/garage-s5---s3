package model;

public class GenreModel extends BaseModel{
    String nom;

    public GenreModel(){}
    
    public GenreModel(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}