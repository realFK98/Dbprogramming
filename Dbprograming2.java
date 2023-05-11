/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package db2;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
/**
 *
 * @author Student
 */
public class Dbprograming2 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
   String username = "root";
   String password = "mysql@sit";
   try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Driver loaded");
      Connection connection = DriverManager.getConnection(url, username, password);
      System.out.println("Database Connected");
      Statement statement = connection.createStatement();
      

   } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
   }catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
  }
        
    }
}
