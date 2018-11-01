package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

    private static final String PINNUMBER = "dbPIN";
 private static final String CONN = "jdbc:mySQL://localhost/login";
 private static final String SQCONN = "jdbc:sqlite:pinnumber.sqlite";

 public static Connection getConnection()throws SQLException {
     try {
         Class.forName("org.sqlite.JDBC");
         return DriverManager.getConnection(SQCONN);

     } catch (ClassNotFoundException e) {
         e.printStackTrace();
     }
     return null;
 }
}