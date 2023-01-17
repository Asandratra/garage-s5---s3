package model;


public class VehiculeModel {
    String matricule;
    int idModele;

    public VehiculeModel(){

    }
    public VehiculeModel(String matricule, int idModele) {
        this.matricule = matricule;
        this.idModele = idModele;
    }

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public int getIdModele() {
        return idModele;
    }
    public void setIdModele(int idModele) {
        this.idModele = idModele;
    }

    
}
