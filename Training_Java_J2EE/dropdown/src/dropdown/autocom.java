/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dropdown;



import com.mxrck.autocompleter.TextAutoCompleter;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class autocom{
    JFrame f=new JFrame();
    JTextField t1;
autocom() throws ClassNotFoundException, SQLException{

    f.setSize(500,500);
    f.setLocation(500,100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(null);
    f.setVisible(true);


    t1=new JTextField();
    t1.setBounds(50,80,200,20);
    f.add(t1);


    TextAutoCompleter complete=new TextAutoCompleter(t1);
    dbconn conn=new dbconn();
        conn.connection();
        conn.retrieve();
    while(conn.rs.next()){

        complete.addItem(conn.rs.getString("items"));
    }


}


    public static void main(String[] args) throws ClassNotFoundException,
    SQLException{           

        new autocom();
   }

}

