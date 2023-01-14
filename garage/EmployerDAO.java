package dao;

import model.EmployerModel;

import java.sql.*;

public class EmployerDAO {
    public void insert(Connection co,EmployerModel emp){
        PreparedStatement st = null;
        String sql = "INSERT INTO employe values (?,?,?,?,?,?,?)";
        try {
            co.setAutoCommit(false);
            st = co.prepareStatement(sql);
            st.setInt(1,emp.getId());
            st.setString(2,emp.getNom());
            st.setString(3,emp.getPrenom());
            st.setInt(4,emp.getIdGenre());
            st.setDate(5, emp.getDdn());
            st.setInt(6, emp.getIdNiveau());
            st.setInt(7,emp.getIdSpeciaite());
            st.executeUpdate();

            co.commit();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
