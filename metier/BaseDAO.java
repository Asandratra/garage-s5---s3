package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {
   private String driver = "org.postgresql.Driver";
   private Connection co;
   private String connect = "jdbc:postgresql://localhost:5432/garages";
   private String user = "postgres";
   private String password = "root";

   public Connection getCon(){
    try {
        System.out.println("e");
        Class.forName(this.getDriver());
        co = DriverManager.getConnection(connect,user,password);
    } catch (Exception e) {
        System.out.println(e);
        // TODO: handle exception
    }
    return co;
   }

public String getDriver() {
    return driver;
}
public void setDriver(String driver) {
    this.driver = driver;
}
public Connection getCo() {
    return co;
}
public void setCo(Connection co) {
    this.co = co;
}
public String getConnect() {
    return connect;
}
public void setConnect(String connect) {
    this.connect = connect;
}
public String getUser() {
    return user;
}
public void setUser(String user) {
    this.user = user;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
   

}
