package ch4Web;

import java.sql.*;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        String sql_statement = "select * from Video";
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","Kalvin","tv228222");
        if (c != null){
            System.out.println("Connection to the database!");
        }else {
            System.out.println("Cannot connect to the database.");
        }

        PreparedStatement pps = c.prepareStatement(sql_statement);
        ResultSet rs = pps.executeQuery();

        ArrayList<Video> result = new ArrayList<>();
        while (rs.next()){
            Video v = new Video(Integer.parseInt(rs.getString("videoId")), rs.getString("videoName"), Integer.parseInt(rs.getString("price")));//獲取videoId,videoName,price的列值

            result.add(v);
        }

        for (Video v : result){
            System.out.println(v.toString());
        }
        c.close();
    }
}
