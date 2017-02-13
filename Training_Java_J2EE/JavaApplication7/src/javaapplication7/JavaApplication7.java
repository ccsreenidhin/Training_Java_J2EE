/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cc4
 */
public class JavaApplication7 {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
             String w="bill";
            Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/based", "root", "root");
            //String s="insert into reg (name,sub1,sub2) values('"+w+"',6,7)";
           String s1="update table set pass='"+w+"'where id=2";
        Statement st=con.createStatement();
        st.executeUpdate(s1);
      // st.executeUpdate(s1);
        } catch (SQLException ex) {
            Logger.getLogger(JavaApplication7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaApplication7.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
