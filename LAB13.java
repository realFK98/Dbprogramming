/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;


/**
 *
 * @author Student
 */
public class LAB13 {
    public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/mydb2";
    String username = "root";
    String password = "mysql@sit";
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, username, password);
       String sql = "update student set email=? where studentID=?";
    
          PreparedStatement prepareStatement =  connection.prepareStatement(sql);
          prepareStatement.setString(1, "aaaa@kmutt.ac.th");
          prepareStatement.setString(2, "75");        
    prepareStatement.executeUpdate();

  

} 
    catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    }
    
}
