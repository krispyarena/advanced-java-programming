package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, "root", "");

            Statement stm = con.createStatement();

            ResultSet rs = stm.executeQuery("SELECT * FROM STUDENT");

            while(rs.next()){
                System.out.println("Name : " + rs.getString("Name") +" " + "Roll : " + rs.getInt("Roll"));
            }

            rs.close();
            stm.close();
            con.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
