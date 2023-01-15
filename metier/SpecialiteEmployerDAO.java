package dao;

import model.*;

import java.sql.*;

public class SpecialiteEmployerDAO {
    public void insert(Connection co,SpecialiteEmployerModel spec_emp){
        PreparedStatement st = null;
        String sql = "INSERT INTO SpecialiteEmploye values (?,?)";
        try {
            co.setAutoCommit(false);
            st = co.prepareStatement(sql);
            st.setInt(1,spec_emp.getIdEmployer());
            st.setInt(2,spec_emp.getIdSpecialite());
            st.executeUpdate();
            co.commit();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
