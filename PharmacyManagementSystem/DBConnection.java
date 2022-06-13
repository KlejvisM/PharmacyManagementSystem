/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PharmacyManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DBConnection {
    public static Connection connect(){
    Connection con = null;
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/javafinalproject?", "root","Musaraj@2020?!");
    System.out.println("Connected to Database");
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    return con;
    }
}
