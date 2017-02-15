/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cc4
 */
public class run implements Runnable{
   

    /**
     * @param args the command line arguments
     */
    public void run(){
        int i=0;
        for(i=0;i<=10;i++)
        {
            try {
                System.out.println(+i);
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(JavaApplication9.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       
        
    }
    public static void main(String[] args) {
        
        JavaApplication9 t1= new JavaApplication9();
       // h t2= new h();
        t1.start();
        //t2.count();
        // TODO code application logic here
    }
    
}

