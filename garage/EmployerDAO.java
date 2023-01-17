package dao;

import model.*;
import service.*;

import model.EmployerModel;

import java.sql.*;

public class EmployerDAO {
    public void insert(Connection co,EmployerModel emp){
        PreparedStatement st = null;
        String sql = "INSERT INTO employe values (nextval('seqemp'),?,?,?,?,?)";
        try {
            co.setAutoCommit(false);
            st = co.prepareStatement(sql);
            st.setString(1,emp.getNom());
            st.setString(2,emp.getPrenom());
            st.setInt(3,emp.getIdGenre());
            st.setDate(4, emp.getDdn());
            st.setInt(5, emp.getIdNiveau());
            st.executeUpdate();

            co.commit();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
