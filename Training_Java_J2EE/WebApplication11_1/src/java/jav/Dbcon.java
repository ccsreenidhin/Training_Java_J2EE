package jav;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cc4
 */
public class Dbcon {
    
    public void insert(Traindet t)
    {
        
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc","root","root");
            Statement nm=con.createStatement();
            String s1="insert into traindet(trainno,source,destination) values('"+t.getTrainno()+"','"+t.getSource()+"','"+t.getDestination()+"')";
            nm.executeUpdate(s1);
            System.out.println("haisfgdfghdfhjgfhj");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbcon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbcon.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
    public void select1()
    {
        
    }

    
}
