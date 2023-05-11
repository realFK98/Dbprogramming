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
public class LAB12 {
    public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/mydb2";
    String username = "root";
    String password = "mysql@sit";
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, username, password);
    String sql = "insert into student(studentID,firstName,lastName,email,deptID) "+
            "values(?,?,?,?,?)";
    
          PreparedStatement prepareStatement =  connection.prepareStatement(sql);
          prepareStatement.setString(1, "75");
          prepareStatement.setString(2, "wichira");        
          prepareStatement.setString(3, "matrakampa");
          prepareStatement.setString(4, "Wichira@gmail.com");
          prepareStatement.setString(5, "it");
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
