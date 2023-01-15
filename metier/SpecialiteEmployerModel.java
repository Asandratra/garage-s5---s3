package model;

import dao.*;
import service.*;


public class SpecialiteEmployerModel {
    int idEmployer;
    int idSpecialite;

    public SpecialiteEmployerModel(){

    }    

    public SpecialiteEmployerModel(int idEmployer, int idSpecialite) {
        this.idEmployer = idEmployer;
        this.idSpecialite = idSpecialite;
    }

    public int getIdEmployer() {
        return idEmployer;
    }
    public void setIdEmployer(int idEmployer) {
        this.idEmployer = idEmployer;
    }
    public int getIdSpecialite() {
        return idSpecialite;
    }
    public void setIdSpecialite(int idSpecialite) {
        this.idSpecialite = idSpecialite;
    }

    
}
