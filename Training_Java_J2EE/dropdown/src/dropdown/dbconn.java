/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dropdown;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class dbconn{

    Connection con; ResultSet rs;PreparedStatement stat;

public void connection() throws ClassNotFoundException, SQLException{
    String url="jdbc:mysql://localhost:3306/new";
    String driver="com.mysql.jdbc.Driver";   
    //String db="d";
    String username="root";
    String password="root";
    stat =null; 

        Class.forName(driver);
       con=(Connection)DriverManager.getConnection
       (url,username,password);              
        System.out.println("Connecttion SuccessFul");
}  

public void retrieve() throws SQLException{

    Statement  stmt=con.createStatement();
    String query="select items from thi";
    rs = stmt.executeQuery(query);

    System.out.println("retrieve succesfully");

}
}

