package service;

import model.EmployerModel;
import java.sql.*;
import dao.BaseDAO;
import dao.EmployerDAO;

public class EmployerService {
    public void insert(EmployerModel emp){
        Connection co = null;
        EmployerDAO ad = new EmployerDAO();
        try {
            co = new BaseDAO().getCon();
            ad.insert(co,emp);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
