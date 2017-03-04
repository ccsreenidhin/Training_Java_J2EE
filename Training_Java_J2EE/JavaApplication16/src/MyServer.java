

import java.rmi.Naming;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cc4
 */
public class MyServer {
    public static void main(String args[]){
        
        try {
            Adder stub=new AdderRemote();
            Naming.rebind("rmi://localhost:5001/monoo", stub);
        } catch (Exception e){System.out.println(e); }
     
    }
}
