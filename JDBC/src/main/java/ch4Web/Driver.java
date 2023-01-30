package ch4Web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        String sql_statement = "select * from Video";
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","Kalvin","tv228222");
        if (c != null){
            System.out.println("Connection to the database!");
        }else {
            System.out.println("Cannot connect to the database.");
        }
    }

}
