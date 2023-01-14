package model;



import model.BaseModel;

public class ClientModel extends BaseModel {
    String nom;
    String prenom;
    int idGenre;
    String tel;
    boolean fidele;

    public ClientModel(){

    }
    
    public ClientModel(int id, String nom, String prenom, int idGenre, String tel, boolean fidele) {
        super(id);
        this.nom = nom;
        this.prenom = prenom;
        this.idGenre = idGenre;
        this.tel = tel;
        this.fidele = fidele;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getIdGenre() {
        return idGenre;
    }
    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public boolean isFidele() {
        return fidele;
    }
    public void setFidele(boolean fidele) {
        this.fidele = fidele;
    }
    
}
