package ch4Web;

import javax.swing.*;
import java.sql.*;

public class Parameterized_Statememt {
    private static Connection c;
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        initializeDB();
        String name = JOptionPane.showInputDialog("Find a video by name.");
        String sql_statememt = "select * from Video where videoName = ? ;"; //where 查詢特定東西
        PreparedStatement pps = c.prepareStatement(sql_statememt);
        pps.setString(1,name);
        ResultSet rs = pps.executeQuery();

        if (rs.next()){
            int title = Integer.parseInt(rs.getString("videoId"));
            String vname = rs.getString("videoName");
            int price = Integer.parseInt(rs.getString("price"));
            //JOptionPane.showMessageDialog(null, title + " " + vname + " " + price); //or create New Video Class execute struct
            JOptionPane.showMessageDialog(null, new Video(title, vname, price));
        }else {
            JOptionPane.showMessageDialog(null,"Video not found...");
        }
        closeDB();
    }

    private static void initializeDB() throws SQLException{
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","Kalvin","tv228222");
        if (c != null){
            System.out.println("Connecting to the database!");
        }else {
            System.out.println("Cannot connect to the database.");
        }
    }

    private static void closeDB() throws SQLException {
        c.close();
    }
}
