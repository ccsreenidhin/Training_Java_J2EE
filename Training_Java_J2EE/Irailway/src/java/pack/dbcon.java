/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cc4
 */
public class dbcon {
    private Connection con;
    private Statement st;
    public dbcon()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc","root","root");
            st=con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
        }
    
            
    }
    public String insert(mrbean mr)
    {
     
        try {
           String s1="insert into traindet(trainno, source, destination, tname, deptim, arvtim, sun, mon, tue, wed, thrs, fri, sat, 1cost, 2cost, 1seats, 2seats, totalseats) values('"+mr.getTrainno()+"','"+mr.getSource()+"','"+mr.getDestination()+"','"+mr.getTname()+"','"+mr.getDeptim()+"','"+mr.getArvtim()+"','"+mr.getSun()+"','"+mr.getMon()+"','"+mr.getTue()+"','"+mr.getWed()+"','"+mr.getThr()+"','"+mr.getFri()+"','"+mr.getSat()+"','"+mr.getCost1()+"','"+mr.getCost2()+"','"+mr.getSeats1()+"','"+mr.getSeats2()+"','"+mr.getTotalseats()+"')";
             //String s1="insert into traindet(mon) values('"+mr.getMon()+"')";
            st.executeUpdate(s1);
            return mr.getTrainno();
        } catch (SQLException ex) {
            Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    return null;
    }
    
     
    public ResultSet select()
    {
     
         try {
             String s="select * from traindet";
               ResultSet rs;
                rs = st.executeQuery(s);
                return rs;
        } catch (SQLException ex) {
            Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
          
   }
    
    
    
}
