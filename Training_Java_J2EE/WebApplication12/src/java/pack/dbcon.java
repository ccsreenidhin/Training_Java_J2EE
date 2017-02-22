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
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classroom","root","root");
            st=con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
        }
    
            
    }
    public void insert(mrbean mr)
    {
     
        try {
            String s1="insert into student(name, rollno, address, phno, email) values('"+mr.getName()+"','"+mr.getRoll()+"','"+mr.getAddr()+"','"+mr.getPhno()+"','"+mr.getEmail()+"')";
             //String s1="insert into student(name) values('"+mr.getName()+"')";
            st.executeUpdate(s1);
        } catch (SQLException ex) {
            Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }
    
    
    public void delete(mrbean mr)
    {
       
        try {
        String s2="delete from student where name='"+mr.getName()+"' ";
          st.executeUpdate(s2);
        } catch (SQLException ex) {
            Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
   }
}

    public void update(mrbean mr)
    {
       
        try { 
            String s2="update student set rollno='"+mr.getRoll()+"', address='"+mr.getAddr()+"', phno='"+mr.getPhno()+"', email='"+mr.getEmail()+"'  where name='"+mr.getName()+"'";
            st.executeUpdate(s2);
        } catch (SQLException ex) {
            Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public ResultSet select()
    {
     
         try {
             String s="select *from student";
               ResultSet rs;
                rs = st.executeQuery(s);
                return rs;
        } catch (SQLException ex) {
            Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
          
   }
    public static void main(String[] args) {
     // dbcon db=new dbcon();
      //db.delete();
    }
    
}
