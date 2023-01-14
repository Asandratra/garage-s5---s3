package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class NiveauDAO {
    public ArrayList getAll(Connection co){
        PreparedStatement stat=null;
        ResultSet rs = null;
        String sql = "SELECT * FROM niveau";
        ArrayList rep = null;
        try {
            stat = co.prepareStatement(sql);
            rs = stat.executeQuery();
            rep = new ArrayList<>();
            while(rs.next()){
                rep.add(new NiveauModel(rs.getString("nom")));
            }
        } catch (Exception e) {
            // TODO: handle exception
        } 
        return rep;
    }   
}
