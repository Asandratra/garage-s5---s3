package dao;

import service.*;
import model.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class SpecialiteDAO {
    public ArrayList getAll(Connection co){
        PreparedStatement stat=null;
        ResultSet rs = null;
        String sql = "SELECT * FROM specialites";
        ArrayList rep = new ArrayList<>();
        try {
            System.out.println(sql);
            stat = co.prepareStatement(sql);
            rs = stat.executeQuery();
            rep = new ArrayList<>();
            while(rs.next()){
                rep.add(new SpecialiteModel(rs.getString("nom")));
            }
        } catch (Exception e) {
            System.out.println(e);
        } 
        return rep;
    }      
}
