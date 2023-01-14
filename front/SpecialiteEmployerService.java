package service;

import dao.*;
import model.*;

import java.sql.*;

public class SpecialiteEmployerService {
    public void insert(SpecialiteEmployerModel spec_emp){
        Connection co = null;
        SpecialiteEmployerDAO ad = new SpecialiteEmployerDAO();
        try {
            co = new BaseDAO().getCon();
            ad.insert(co,spec_emp);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
