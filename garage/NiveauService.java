package service;

import java.util.ArrayList;
import java.sql.*;

import dao.BaseDAO;
import dao.GenreDAO;


public class NiveauService {
    public ArrayList getAll(){
        Connection co = null;
        NiveauDAO ad = new NiveauDAO();
        ArrayList rep = null;
        try {
            co = new BaseDAO().getCon();
            rep = ad.getAll(co);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
