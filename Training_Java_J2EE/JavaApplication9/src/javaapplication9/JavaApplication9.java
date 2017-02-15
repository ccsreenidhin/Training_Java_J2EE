/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cc4
 */
public class JavaApplication9 extends Thread{

    /**
     * @param args the command line arguments
     */
    public void run(){
        int i=0;
        for(i=0;i<=10;i++)
        {
            try {
                System.out.println(+i);
                //join();
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(JavaApplication9.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       /* for(i=10;i!=0;i--)
        {
            try {
                sleep(1000);
                System.out.println(+i);
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(JavaApplication9.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        
       
        
    }
    public static void main(String[] args) {
        
        JavaApplication9 t1= new JavaApplication9();
        JavaApplication9 t2= new JavaApplication9();
       // h t2= new h();
        t1.start();
       /* try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaApplication9.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        t2.start();
       // t2.count();
        // TODO code application logic here
    }
    
}
