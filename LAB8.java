/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db2;

/**
 *
 * @author Student
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;

public class LAB7 {
    public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/mydb2";
    String username = "root";
    String password = "mysql@sit";
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, username, password);
    Statement statement = connection.createStatement();
    String sql = "SELECT * FROM student";
    ResultSet resultSet = statement.executeQuery(sql);

    while(resultSet.next()){
        System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
    }

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
