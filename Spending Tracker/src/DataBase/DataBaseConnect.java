/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 91799
 */
public class DataBaseConnect {
    public static Connection con;
    public static Statement st;
    static{
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSl=false","root",null);
            st = con.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,  e);
        }
    }
}
