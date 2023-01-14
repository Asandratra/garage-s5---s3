package service;

import java.util.ArrayList;
import java.sql.*;

import dao.BaseDAO;
import dao.GenreDAO;


public class SpecialiteService {
    public ArrayList getAll(){
        Connection co = null;
        SpecialiteDAO ad = new SpecialiteDAO();
        ArrayList rep = null;
        try {
            co = new BaseDAO().getCon();
            rep = ad.getAll(co);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
