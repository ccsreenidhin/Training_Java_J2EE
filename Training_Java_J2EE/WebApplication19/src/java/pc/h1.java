/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author cc4
 */
public class h1 extends TagSupport{
    private String name;
    public void sets(String name)
    {
      this.name=name; 
    }
    @Override
    public int doStartTag()throws JspException{
    JspWriter out=pageContext.getOut();
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classroom","root","root");
        PreparedStatement ps=con.preparedStatement("select * from "+name+" where id=?");
        ps.setInt(1,Integer.parseInt(id));
        ResultSet rs=ps.executeQuery();
        if(rs!=null){
           ResultSetMetaData rsmd=rs.getMetaData();
           int total=rsmd.getColumnCount();
           out.write("<table border='1'>");
           out.write("<tr>");
           for(int i = 1;i<total;i++){
               out.write("<th>"+rsmd.getColumnName(i)+"</th>");
             }
           
           out.write("</tr>");
           if(rs.next()){
              out.write("<tr>");
               for(int i = 1;i<total;i++){
               out.write("<td>"+rs.getString(i)+"</td>");
             }
               out.write("</tr>");
               
           }
           else{
               out.write("Table not found");
           }
        }
        
        
    } catch (ClassNotFoundException | SQLException | IOException ex) {
        Logger.getLogger(h1.class.getName()).log(Level.SEVERE, null, ex);
    }
      return SKIP_BODY;
    
}
}
